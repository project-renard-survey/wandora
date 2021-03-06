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
 * MixedTopicTableRowSorter.java
 *
 */


package org.wandora.application.gui.table;

import java.util.Comparator;
import javax.swing.table.TableRowSorter;
import org.wandora.application.gui.topicstringify.TopicToString;
import org.wandora.topicmap.Topic;

/**
 *
 * @author akivela
 */



public class MixedTopicTableRowSorter extends TableRowSorter {


    public MixedTopicTableRowSorter(MixedTopicTableModel dm) {
        super(dm);
    }

    

    
    
    @Override
    public Comparator<?> getComparator(int column) {
        return new Comparator() {
            public int compare(Object o1, Object o2) {
                if(o1 == null || o2 == null) return 0;
                if(o1 instanceof Topic && o2 instanceof Topic) {
                    try {
                        String n1 = TopicToString.toString((Topic) o1);
                        String n2 = TopicToString.toString((Topic) o2);
                        return n1.compareTo(n2);
                    }
                    catch(Exception e) {
                        return 0;
                    }
                }
                else if(o1 instanceof String && o2 instanceof String) {
                    try {
                        int d = ((String) o1).compareTo((String) o2);
                        return d;
                    }
                    catch(Exception e) {}
                    return 0;
                }
                else {
                    return 0;
                }
            }
        };
    }
    
    
    @Override
    public boolean useToString(int column) {
        return false;
    }
}

