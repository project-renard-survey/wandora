/*
 * WANDORA
 * Knowledge Extraction, Management, and Publishing Application
 * http://wandora.org
 * 
 * Copyright (C) 2004-2016 Wandora Team
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * 
 * GraphEdgeContext.java
 *
 * Created on 13. kes�kuuta 2007, 15:58
 *
 */

package org.wandora.application.contexts;


import org.wandora.application.gui.topicpanels.graphpanel.*;
import org.wandora.application.gui.topicpanels.*;
import org.wandora.application.gui.*;
import org.wandora.application.*;

import java.util.*;
import java.awt.event.*;


/**
 *
 * @author akivela
 */
public class GraphEdgeContext implements Context {
    
    private Object contextSource;
    protected WandoraTool contextOwner = null;
    protected ActionEvent actionEvent = null;
    protected Wandora wandora = null;
    
    
    /** Creates a new instance of NodeContext */
    public GraphEdgeContext() {
    }
    
    
    @Override
    public void initialize(Wandora wandora, ActionEvent actionEvent, WandoraTool contextOwner) {
        this.wandora = wandora;
        this.actionEvent = actionEvent;
        this.contextOwner = contextOwner;
        
        Object proposedContextSource = UIBox.getActionsRealSource(actionEvent);
        if( !isContextSource(proposedContextSource) ) {
            proposedContextSource = wandora.getFocusOwner();
            if( !isContextSource(proposedContextSource) ) {
                proposedContextSource = wandora;
            }
        }
        setContextSource( proposedContextSource );
    }
    
    
    
    @Override
    public ActionEvent getContextEvent() {
        return actionEvent;
    }
    
    
    
    @Override
    public Iterator getContextObjects() {
        return getContextObjects( getContextSource() );
    }
    
    
    
    public Iterator getContextObjects(Object contextSource) {
        if(contextSource == null) return null;
        
        ArrayList contextEdges = new ArrayList();
        if(contextSource instanceof Wandora) {
            try {
                Wandora w = (Wandora) contextSource;
                TopicPanel currentTopicPanel = w.getTopicPanel();
                if(currentTopicPanel != null && currentTopicPanel instanceof DockingFramePanel) {
                    currentTopicPanel = ((DockingFramePanel) currentTopicPanel).getCurrentTopicPanel();
                }
                if(currentTopicPanel != null && currentTopicPanel instanceof GraphTopicPanel) {
                    contextEdges.addAll( ((GraphTopicPanel) currentTopicPanel).getGraphPanel().getSelectedEdges() );
                    if(contextEdges.isEmpty()) {
                        //contextEdges.add( ((GraphTopicPanel) currentTopicPanel).getGraphPanel().getMouseOverEdge() );
                    }
                }
                if(currentTopicPanel != null && currentTopicPanel instanceof TopicMapGraphPanel) {
                    contextEdges.addAll( ((TopicMapGraphPanel) currentTopicPanel).getSelectedEdges() );
                    if(contextEdges.isEmpty()) {
                        //contextEdges.add( ((TopicMapGraphPanel) currentTopicPanel).getMouseOverEdge() );
                    }
                }
            }
            catch (Exception e) {
                log(e);
            }
        }
        else if(contextSource instanceof GraphTopicPanel) {
            contextEdges.addAll( ((GraphTopicPanel) contextSource).getGraphPanel().getSelectedEdges() );
        }
        else if(contextSource instanceof TopicMapGraphPanel) {
            contextEdges.addAll( ((TopicMapGraphPanel) contextSource).getSelectedEdges() );
        }
        return contextEdges.iterator();
    }
    
    

    @Override
    public void setContextSource(Object proposedContextSource) {
        if(isContextSource(proposedContextSource)) {
            contextSource = proposedContextSource;
        }
        else {
            contextSource = null;
        }
    }
    
    
    public boolean isContextSource(Object contextSource) {
        if(contextSource != null && (
                contextSource instanceof Wandora ||
                contextSource instanceof GraphTopicPanel) ) {
                    return true;
        }
        return false;
    }
    
    
    
    @Override
    public Object getContextSource() {
        return contextSource;
    }
    
    
    
    // -------------------------------------------------------------------------
    
    
    public void log(Exception e) {
        if(contextOwner != null) contextOwner.log(e);
        else e.printStackTrace();
    }
}
