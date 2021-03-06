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
 * 
 * DeleteTopicsWithoutOccurrences.java
 *
 * Created on 12. kes�kuuta 2006, 17:43
 *
 */

package org.wandora.application.tools;




import java.util.*;

import org.wandora.topicmap.*;
import org.wandora.application.*;


/**
 *
 * @author akivela
 */
public class DeleteTopicsWithoutOccurrences extends DeleteTopics implements WandoraTool {
    
    
    @Override
    public String getName() {
        return "Delete topics without occurrences";
    }


    @Override
    public String getDescription() {
        return "Delete context topics without occurrences.";
    }
    

    @Override
    public boolean shouldDelete(Topic topic)  throws TopicMapException {
        try {
            Collection dataTypes = topic.getDataTypes();
            if(dataTypes == null || dataTypes.isEmpty()) {
                if(confirm) {
                    return confirmDelete(topic);
                }
                else {
                    return true;
                }
            }
        }
        catch(Exception e) {
            log(e);
        }
        return false;
    }
    
    
}
