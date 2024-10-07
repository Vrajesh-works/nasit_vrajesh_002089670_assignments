/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonManager;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.PersonDirectory;

/**
 *
 * @author dhyeyrabadia
 */
public class PersonMngWorkAreaJPanel extends javax.swing.JPanel {
    JPanel personProfileContainer;
    PersonDirectory personDirectory;
    /**
     * Creates new form PersonMngWorkAreaJPanel
     */
    public PersonMngWorkAreaJPanel(JPanel container, PersonDirectory directory) {
        initComponents();
        personProfileContainer = container;
        personDirectory = directory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreatePersonProfile = new javax.swing.JButton();
        btnManagePersonProfile = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        btnCreatePersonProfile.setText("Create Person Profile");
        btnCreatePersonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonProfileActionPerformed(evt);
            }
        });

        btnManagePersonProfile.setText("List Persons");
        btnManagePersonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePersonProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManagePersonProfile)
                    .addComponent(btnCreatePersonProfile))
                .addContainerGap(454, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreatePersonProfile, btnManagePersonProfile});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnCreatePersonProfile)
                .addGap(18, 18, 18)
                .addComponent(btnManagePersonProfile)
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePersonProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonProfileActionPerformed
        // TODO add your handling code here:
        
        // open Create Person Profile page when this button gets clicked
        CreatePersonJPanel panel = new CreatePersonJPanel(personProfileContainer, personDirectory);
        personProfileContainer.add("CreatePersonJPanel", panel);
        
        CardLayout layout = (CardLayout) personProfileContainer.getLayout();
        layout.next(personProfileContainer);
    }//GEN-LAST:event_btnCreatePersonProfileActionPerformed

    private void btnManagePersonProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePersonProfileActionPerformed
        // TODO add your handling code here:
        
        // open Manage Person Profile page when this button gets clicked
        ManagePersonJPanel panel = new ManagePersonJPanel(personProfileContainer, personDirectory);
        personProfileContainer.add("ManagePersonJPanel", panel);
        
        CardLayout layout = (CardLayout) personProfileContainer.getLayout();
        layout.next(personProfileContainer);
    }//GEN-LAST:event_btnManagePersonProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePersonProfile;
    private javax.swing.JButton btnManagePersonProfile;
    // End of variables declaration//GEN-END:variables
}
