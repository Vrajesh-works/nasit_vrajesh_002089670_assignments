/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonManager;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author dhyeyrabadia
 */
public class ManagePersonJPanel extends javax.swing.JPanel {
    JPanel personProfileContainer;
    PersonDirectory personDirectory;
    /**
     * Creates new form ManagePersonJPanel
     */
    public ManagePersonJPanel(JPanel container, PersonDirectory directory) {
        initComponents();
        personProfileContainer = container;
        personDirectory = directory;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersons = new javax.swing.JTable();
        btnViewPerson = new javax.swing.JButton();
        btnSearchPerson = new javax.swing.JButton();
        btnDeletePerson = new javax.swing.JButton();
        txtSearchBox = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));

        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Person Profile");

        tblPersons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Home City", "Home Zip Code", "Work City", "Work Zip Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersons);

        btnViewPerson.setText("View Person");
        btnViewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPersonActionPerformed(evt);
            }
        });

        btnSearchPerson.setText("Search Person");
        btnSearchPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPersonActionPerformed(evt);
            }
        });

        btnDeletePerson.setText("Delete Person");
        btnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePersonActionPerformed(evt);
            }
        });

        txtSearchBox.setText("Type first Name or Last Name or Street Address");
        txtSearchBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchBoxFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletePerson)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearchPerson)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnViewPerson))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDeletePerson, btnSearchPerson, btnViewPerson});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnViewPerson)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchPerson)
                    .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDeletePerson)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, jLabel1});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        personProfileContainer.remove(this);
        CardLayout layout = (CardLayout) personProfileContainer.getLayout();
        layout.previous(personProfileContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchBoxFocusGained
        // TODO add your handling code here:
        // Clear the default text when the field gains focus
            if (txtSearchBox.getText().equals("Type first Name or Last Name or Street Address")) {
                txtSearchBox.setText("");
            }
    }//GEN-LAST:event_txtSearchBoxFocusGained

    private void txtSearchBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchBoxFocusLost
        // TODO add your handling code here:
        // Restore the default text if the field is empty when focus is lost
            if (txtSearchBox.getText().isEmpty()) {
                txtSearchBox.setText("Type first Name or Last Name or Street Address");
            }
    }//GEN-LAST:event_txtSearchBoxFocusLost

    private void btnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblPersons.getSelectedRow();
    
        if(selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete selected Persons's Profile?", "Warning", dialogButton);
    
//            System.out.println("Dialog result: " + dialogResult); // Debugging line
    
            if(dialogResult == JOptionPane.YES_OPTION) {
                Person selectedPerson = (Person) tblPersons.getValueAt(selectedRow, 0);
        
                if (selectedPerson != null) {
                    personDirectory.deletePerson(selectedPerson);
                    populateTable();
                } 
            } 
        } 
        else {
            JOptionPane.showMessageDialog(null,"Please select an Person's Profile from the list.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletePersonActionPerformed

    private void btnViewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPersonActionPerformed
        // TODO add your handling code here:      
        int selectedRow = tblPersons.getSelectedRow();
        
        if(selectedRow >= 0){
            Person selectedPerson = (Person) tblPersons.getValueAt(selectedRow, 0);
            
            // Open View Account Page from here
            ViewPersonJPanel panel = new ViewPersonJPanel(personProfileContainer, personDirectory, selectedPerson);
            personProfileContainer.add("ViewPersonJPanel", panel);
            CardLayout layout = (CardLayout) personProfileContainer.getLayout();
            layout.next(personProfileContainer);
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select an Person from the list to view!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewPersonActionPerformed

    private void btnSearchPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPersonActionPerformed
        // TODO add your handling code here:
        
        if(!txtSearchBox.getText().isBlank()){
            String searchQuery = txtSearchBox.getText();
            Person foundPerson = personDirectory.searchPerson(searchQuery);
            
            if(foundPerson != null){
                ViewPersonJPanel panel = new ViewPersonJPanel(personProfileContainer, personDirectory, foundPerson);
                personProfileContainer.add("ViewAccountJPanel", panel);
                CardLayout layout = (CardLayout) personProfileContainer.getLayout();
                layout.next(personProfileContainer);
            }else{
                JOptionPane.showMessageDialog(null,"Account not found, please check the account number and try again!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Please type the account number to view", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchPersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeletePerson;
    private javax.swing.JButton btnSearchPerson;
    private javax.swing.JButton btnViewPerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersons;
    private javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblPersons.getModel();
        model.setRowCount(0);
        
        for(Person p : personDirectory.getPersons()){
            Object[] row = new Object[6];
            row[0] = p;
            row[1] = p.getLastName();
            row[2] = p.getHomeAddress().getCity();
            row[3] = p.getHomeAddress().getZipCode();
            row[4] = p.getWorkAddress().getCity();
            row[5] = p.getWorkAddress().getZipCode();
            
            model.addRow(row);
        }
    }
}
