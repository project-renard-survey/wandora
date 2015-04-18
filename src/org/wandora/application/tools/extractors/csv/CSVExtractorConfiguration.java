/*
 * WANDORA
 * Knowledge Extraction, Management, and Publishing Application
 * http://wandora.org
 * 
 * Copyright (C) 2004-2015 Wandora Team
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
 */





package org.wandora.application.tools.extractors.csv;

import javax.swing.JDialog;
import org.wandora.application.Wandora;
import org.wandora.application.gui.simple.SimpleButton;
import org.wandora.application.gui.simple.SimpleComboBox;
import org.wandora.application.gui.simple.SimpleField;
import org.wandora.application.gui.simple.SimpleLabel;

/**
 *
 * @author akivela
 */


public class CSVExtractorConfiguration extends javax.swing.JPanel {

    public static final char defaultStringCharacter = '"';
    public static final char defaultLineSeparator = '\n';
    public static final char defaultValueSeparator = ',';
    
    private JDialog myDialog = null;
    private boolean wasAccepted = false;
    
    
    /**
     * Creates new form CSVExtractorConfiguration
     */
    public CSVExtractorConfiguration() {
        initComponents();
        encodingComboBox.setEditable(false);
    }
    
    
    public void open(Wandora wandora) {
        if(myDialog == null) {
            myDialog = new JDialog(wandora, true);
            myDialog.setTitle("CSV extractor options");
            myDialog.add(this);
        }
        wasAccepted = false;
        myDialog.setSize(400,240);
        wandora.centerWindow(myDialog);
        myDialog.setVisible(true);
        
        // WAIT TILL CONFIGURATION DIALOG IS CLOSED!
    }
    
    
    public boolean wasAccepted() {
        return wasAccepted;
    }
    
    
    public void setStringCharacter(char c) {
        stringCharTextField.setText(getAsString(c));
    }
    
    public void setLineSeparator(char c) {
        lineSeparatorTextField.setText(getAsString(c));
    }
    
    public void setValueSeparator(char c) {
        valueSeparatorTextField.setText(getAsString(c));
    }
    
    public void setEncoding(String encoding) {
        encodingComboBox.setSelectedItem(encoding);
    }
    
    
    public char getStringCharacter() {
        return getAsChar(stringCharTextField.getText());
    }
    
    public char getLineSeparator() {
        return getAsChar(lineSeparatorTextField.getText());
    }
    
    public char getValueSeparator() {
        return getAsChar(valueSeparatorTextField.getText());
    }
    
    public String getEncoding() {
        return encodingComboBox.getSelectedItem().toString();
    }
    
    
    // -------
    
    private char getAsChar(String str) {
        if(str.length() == 0) return 0;
        if(str != null && str.length() == 1) return str.charAt(0);
        if(str.charAt(0)=='\\' && str.charAt(1)=='n') return '\n';
        if(str.charAt(0)=='\\' && str.charAt(1)=='t') return '\t';
        if(str.charAt(0)=='\\' && str.charAt(1)=='r') return '\r';
        if(str.charAt(0)=='0' && str.charAt(1)=='x') {
            try {
                int n = Integer.parseInt(str.substring(2), 16);
                return (char) n;
            }
            catch(Exception e) {
                // PASS SILENTLY
            }
        }
        return str.charAt(0);
    }
    
    
    
    private String getAsString(char c) {
        if(c == '\n') return "\\n";
        if(c == '\t') return "\\t";
        if(c == '\r') return "\\r";
        if(c == '\r') return "\\r";
        return "" + c;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        optionsPanel = new javax.swing.JPanel();
        confLabel = new SimpleLabel();
        valueseparatorLabel = new SimpleLabel();
        valueSeparatorTextField = new SimpleField();
        lineSeparatorLabel = new SimpleLabel();
        lineSeparatorTextField = new SimpleField();
        stringCharLabel = new SimpleLabel();
        stringCharTextField = new SimpleField();
        encodingLabel = new SimpleLabel();
        encodingComboBox = new SimpleComboBox();
        buttonPanel = new javax.swing.JPanel();
        fillerPanel = new javax.swing.JPanel();
        okButton = new SimpleButton();
        cancelButton = new SimpleButton();

        setLayout(new java.awt.GridBagLayout());

        optionsPanel.setLayout(new java.awt.GridBagLayout());

        confLabel.setText("CSV extractor options are");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        optionsPanel.add(confLabel, gridBagConstraints);

        valueseparatorLabel.setText("Value separator");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        optionsPanel.add(valueseparatorLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 0);
        optionsPanel.add(valueSeparatorTextField, gridBagConstraints);

        lineSeparatorLabel.setText("Line separator");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        optionsPanel.add(lineSeparatorLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 0);
        optionsPanel.add(lineSeparatorTextField, gridBagConstraints);

        stringCharLabel.setText("String character");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        optionsPanel.add(stringCharLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 0);
        optionsPanel.add(stringCharTextField, gridBagConstraints);

        encodingLabel.setText("Character encoding");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        optionsPanel.add(encodingLabel, gridBagConstraints);

        encodingComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UTF-8", "UTF-16", "ISO-8859-1", "US-ASCII", " " }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 0);
        optionsPanel.add(encodingComboBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        add(optionsPanel, gridBagConstraints);

        buttonPanel.setLayout(new java.awt.GridBagLayout());

        fillerPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        buttonPanel.add(fillerPanel, gridBagConstraints);

        okButton.setText("OK");
        okButton.setPreferredSize(new java.awt.Dimension(75, 23));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        buttonPanel.add(okButton, gridBagConstraints);

        cancelButton.setText("Cancel");
        cancelButton.setPreferredSize(new java.awt.Dimension(75, 23));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(cancelButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(buttonPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        wasAccepted = false;
        if(myDialog != null) myDialog.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        wasAccepted = true;
        if(myDialog != null) myDialog.setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel confLabel;
    private javax.swing.JComboBox encodingComboBox;
    private javax.swing.JLabel encodingLabel;
    private javax.swing.JPanel fillerPanel;
    private javax.swing.JLabel lineSeparatorLabel;
    private javax.swing.JTextField lineSeparatorTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JLabel stringCharLabel;
    private javax.swing.JTextField stringCharTextField;
    private javax.swing.JTextField valueSeparatorTextField;
    private javax.swing.JLabel valueseparatorLabel;
    // End of variables declaration//GEN-END:variables
}
