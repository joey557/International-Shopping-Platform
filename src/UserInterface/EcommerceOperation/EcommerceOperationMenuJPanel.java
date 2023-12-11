/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.EcommerceOperation;

import UserInterface.EcommerceContactTeam.*;
import Business.Business;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author joey
 */
public class EcommerceOperationMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EcoCTJPanel
     */
    Enterprise ep;
    UserAccount ua;
    Business business;
    JPanel CardSequencePanel;
   

    public EcommerceOperationMenuJPanel(Enterprise enterprise, Business business, JPanel CardSequencePanel) {
        this.ep = enterprise;
        this.business = business;
        this.CardSequencePanel = CardSequencePanel;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageOrder = new javax.swing.JButton();
        btnViewProduct = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        btnManageOrder.setText("Manage Order");
        btnManageOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrderActionPerformed(evt);
            }
        });

        btnViewProduct.setText("View Product");
        btnViewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("E-commerce Operation's Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblTitle)
                .addGap(147, 147, 147)
                .addComponent(btnViewProduct)
                .addGap(33, 33, 33)
                .addComponent(btnManageOrder)
                .addContainerGap(288, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductActionPerformed
        // TODO add your handling code here:
        EcoViewProductJPanel viewproduct = new EcoViewProductJPanel(ep, business, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("EcoViewProductJPanel", viewproduct);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnViewProductActionPerformed

    private void btnManageOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrderActionPerformed
        // TODO add your handling code here:
        ManageOrderStatusJPanel manageorder = new ManageOrderStatusJPanel(ep, business, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ManageOrderStatusJPanel", manageorder);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnManageOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrder;
    private javax.swing.JButton btnViewProduct;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}