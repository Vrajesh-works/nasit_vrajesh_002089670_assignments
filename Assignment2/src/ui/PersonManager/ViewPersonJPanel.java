/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonManager;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Vrajesh
 */
public class ViewPersonJPanel extends javax.swing.JPanel {
    private JPanel personProfileContainer;
    private PersonDirectory personDirectory;
    private Person person;
    /**
     * Creates new form ViewPersonJPanel
     */
    public ViewPersonJPanel(JPanel container, PersonDirectory directory, Person person) {
        initComponents();
        this.personProfileContainer = container;
        this.personDirectory = directory;
        this.person = person;
        
        setViewMode();
        refreshTextFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtWorkStreetAddress = new javax.swing.JTextField();
        txtWorkUnitNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtWorkCity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtWorkState = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtWorkZipCode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtWorkPhoneNumber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtHomeStreetAddress = new javax.swing.JTextField();
        txtHomeUnitNumber = new javax.swing.JTextField();
        txtHomeCity = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        txtHomeState = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtHomeZipCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHomePhoneNumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtSocialSecurityNumber = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chkIsActive = new javax.swing.JCheckBox();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Home Address");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Work Address");

        jLabel10.setText("Street Address");

        jLabel11.setText("Unit Number");

        jLabel12.setText("City");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Person Profile");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel13.setText("State");

        jLabel4.setText("Social Security Number");

        jLabel14.setText("Zip Code");

        jLabel5.setText("Age");

        jLabel15.setText("Phone Number");

        jLabel16.setText("State");

        jLabel17.setText("Zip Code");

        jLabel18.setText("Phone Number");

        jLabel19.setText("Street Address");

        jLabel6.setText("Gender");

        jLabel20.setText("Unit Number");

        jLabel21.setText("City");

        jLabel7.setText("Is Active");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFirstName)
                                        .addComponent(txtLastName)
                                        .addComponent(txtSocialSecurityNumber)
                                        .addComponent(txtAge)
                                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chkIsActive)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtHomeStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHomeUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHomeState, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHomeCity, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHomeZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHomePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(60, 60, 60)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtWorkStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtWorkUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtWorkState, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtWorkCity, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtWorkZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtWorkPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSave, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(chkIsActive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtHomeStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHomeUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHomeCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHomeState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHomeZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHomePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtWorkStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtWorkUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtWorkCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWorkState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWorkZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWorkPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        int age;
        boolean isActive;
        char gender;
        long homePhoneNumber;
        long workPhoneNumber;
        
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String socialSecurityNumber = txtSocialSecurityNumber.getText();
        isActive = chkIsActive.isSelected();
//        System.out.println(isActive);
        
        // Home details
        String homeStreetAdd = txtHomeStreetAddress.getText();
        String homeUnitNumber = txtHomeUnitNumber.getText();
        String homeCity = txtHomeCity.getText();
        String homeState = txtHomeState.getText();
        String homeZipCode = txtHomeZipCode.getText();
        
        // Work details
        String workStreetAdd = txtWorkStreetAddress.getText();
        String workUnitNumber = txtWorkUnitNumber.getText();
        String workCity = txtWorkCity.getText();
        String workState = txtWorkState.getText();
        String workZipCode = txtWorkZipCode.getText();
        
        if(firstName.isBlank() || lastName.isBlank() || socialSecurityNumber.isBlank() || homeStreetAdd.isBlank() || homeUnitNumber.isBlank() || homeCity.isBlank() || homeState.isBlank() || homeZipCode.isBlank() || workStreetAdd.isBlank() || workUnitNumber.isBlank() || workCity.isBlank() || workState.isBlank() || workZipCode.isBlank()){
            JOptionPane.showMessageDialog(this, "All Fields are mandatory.", "Error", JOptionPane.ERROR_MESSAGE);
            // wait until the user clicks on close tag
            return;
        }
       
          try{
            age = Integer.parseInt(txtAge.getText());
            gender = txtGender.getText().charAt(0);
            homePhoneNumber = Long.parseLong(txtHomePhoneNumber.getText());
            workPhoneNumber = Long.parseLong(txtWorkPhoneNumber.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please check Age, Gender, Work Phone Number and Home Phone Number.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
          
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setSocialSecurityNumber(socialSecurityNumber);
        person.setAge(age);
        person.setIsActive(isActive);
        person.setGender(gender);
        // Set the values to the homeAddress Object that points to the Address Class
        person.setHomeAddress(new Address(homeStreetAdd, homeUnitNumber, homeCity, homeState, homeZipCode, homePhoneNumber));
        // Set the values to workAddress Object that points to the Address Class
        person.setWorkAddress(new Address(workStreetAdd, workUnitNumber,workCity, workState, workZipCode, workPhoneNumber));
        
        // to display successfull information saved message
        JOptionPane.showMessageDialog(this, "Personal Profile updated Successfully!.", "Information", JOptionPane.INFORMATION_MESSAGE);
        
        // Empty all the text-fields after saving the information
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAge.setText("");
        txtSocialSecurityNumber.setText("");
        txtGender.setText("");
        chkIsActive.setSelected(false);
        
        txtHomeStreetAddress.setText("");
        txtHomeUnitNumber.setText("");
        txtHomeCity.setText("");
        txtHomeState.setText("");
        txtHomeZipCode.setText("");
        txtHomePhoneNumber.setText("");
        txtWorkStreetAddress.setText("");
        txtWorkUnitNumber.setText("");
        txtWorkCity.setText("");
        txtWorkState.setText("");
        txtWorkZipCode.setText("");
        txtWorkPhoneNumber.setText("");
        
        setViewMode();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        personProfileContainer.remove(this);
        
        Component[] panelStack = personProfileContainer.getComponents();
        JPanel lastPanel = (JPanel) panelStack[panelStack.length -1];
        ManagePersonJPanel managePersonJPanel = (ManagePersonJPanel) lastPanel;
        managePersonJPanel.populateTable();
        
        CardLayout layout = (CardLayout) personProfileContainer.getLayout();
        layout.previous(personProfileContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        setEditMode();
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkIsActive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHomeCity;
    private javax.swing.JTextField txtHomePhoneNumber;
    private javax.swing.JTextField txtHomeState;
    private javax.swing.JTextField txtHomeStreetAddress;
    private javax.swing.JTextField txtHomeUnitNumber;
    private javax.swing.JTextField txtHomeZipCode;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSocialSecurityNumber;
    private javax.swing.JTextField txtWorkCity;
    private javax.swing.JTextField txtWorkPhoneNumber;
    private javax.swing.JTextField txtWorkState;
    private javax.swing.JTextField txtWorkStreetAddress;
    private javax.swing.JTextField txtWorkUnitNumber;
    private javax.swing.JTextField txtWorkZipCode;
    // End of variables declaration//GEN-END:variables

    private void refreshTextFields(){
        txtAge.setText(String.valueOf(person.getAge()));
        txtFirstName.setText(person.getFirstName());
        txtLastName.setText(person.getLastName());
        txtGender.setText(String.valueOf(person.getGender()));
        txtSocialSecurityNumber.setText(person.getSocialSecurityNumber());
        chkIsActive.setSelected(person.isActive());
        txtHomeCity.setText(person.getHomeAddress().getCity());
        txtHomePhoneNumber.setText(String.valueOf(person.getHomeAddress().getPhoneNumber()));
        txtHomeState.setText(person.getHomeAddress().getState());
        txtHomeStreetAddress.setText(person.getHomeAddress().getStreetAddress());
        txtHomeUnitNumber.setText(person.getHomeAddress().getUnitNumber());
        txtHomeZipCode.setText(person.getHomeAddress().getZipCode());
        txtWorkCity.setText(person.getWorkAddress().getCity());
        txtWorkPhoneNumber.setText(String.valueOf(person.getWorkAddress().getPhoneNumber()));
        txtWorkState.setText(person.getWorkAddress().getState());
        txtWorkStreetAddress.setText(person.getWorkAddress().getStreetAddress());
        txtWorkUnitNumber.setText(person.getWorkAddress().getUnitNumber());
        txtWorkZipCode.setText(person.getWorkAddress().getZipCode());
    }
    
    private void setViewMode(){
        txtAge.setEnabled(false);
        txtFirstName.setEnabled(false);
        txtLastName.setEnabled(false);
        txtGender.setEnabled(false);
        txtSocialSecurityNumber.setEnabled(false);
        chkIsActive.setEnabled(false);
        txtHomeCity.setEnabled(false);
        txtHomePhoneNumber.setEnabled(false);
        txtHomeState.setEnabled(false);
        txtHomeStreetAddress.setEnabled(false);
        txtHomeUnitNumber.setEnabled(false);
        txtHomeZipCode.setEnabled(false);
        txtWorkCity.setEnabled(false);
        txtWorkPhoneNumber.setEnabled(false);
        txtWorkState.setEnabled(false);
        txtWorkStreetAddress.setEnabled(false);
        txtWorkUnitNumber.setEnabled(false);
        txtWorkZipCode.setEnabled(false);
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }
    
    private void setEditMode(){
        txtAge.setEnabled(true);
        txtFirstName.setEnabled(true);
        txtLastName.setEnabled(true);
        txtGender.setEnabled(true);
        txtSocialSecurityNumber.setEnabled(true);
        chkIsActive.setEnabled(true);
        txtHomeCity.setEnabled(true);
        txtHomePhoneNumber.setEnabled(true);
        txtHomeState.setEnabled(true);
        txtHomeStreetAddress.setEnabled(true);
        txtHomeUnitNumber.setEnabled(true);
        txtHomeZipCode.setEnabled(true);
        txtWorkCity.setEnabled(true);
        txtWorkPhoneNumber.setEnabled(true);
        txtWorkState.setEnabled(true);
        txtWorkStreetAddress.setEnabled(true);
        txtWorkUnitNumber.setEnabled(true);
        txtWorkZipCode.setEnabled(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }
}
