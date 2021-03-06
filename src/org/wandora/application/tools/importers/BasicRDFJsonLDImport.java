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
 */
package org.wandora.application.tools.importers;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import java.io.InputStream;
import org.wandora.topicmap.TopicMap;

/**
 *
 * @author olli
 */


public class BasicRDFJsonLDImport extends BasicRDFImport {
    
    public BasicRDFJsonLDImport() {
    }
    
    public BasicRDFJsonLDImport(int options) {
        setOptions(options);
    }


    @Override
    public String getName() {
        return "Basic JSON-LD import";
    }

    @Override
    public String getDescription() {
        return "Tool imports JSON-LD file and merges RDF triplets to current topic map. \n"+
               "Used schema is slightly more advanced than Simple RDF XML import. Topic \n"+
               "base names are set when rdfs:label predicates are used and topic types \n"+
               "with rdf:type predicates.";
    }



    @Override
    public void importRDF(InputStream in, TopicMap map) {
        if(in != null) {
            // create an empty model
            Model model = ModelFactory.createDefaultModel();
            // read the RDF json-ld file
            model.read(in, "", "JSON-LD");
            RDF2TopicMap(model, map);
        }
    }    
}
