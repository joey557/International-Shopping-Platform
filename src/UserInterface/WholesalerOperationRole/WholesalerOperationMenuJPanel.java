/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WholesalerOperationRole;

import Business.Business;
import UserInterface.WholesalerOperationRole.AddProductJPanel;
import javax.swing.JPanel;

/**
 *
 * @author joey
 */
public class WholesalerOperationMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuJPanel
     */
    JPanel userProcessContainer;
    Business business;
    public WholesalerOperationMenuJPanel(Business business, JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddProduct = new javax.swing.JButton();
        btnManageInventory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnViewProduct = new javax.swing.JButton();

        btnAddProduct.setText("Add Product");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnManageInventory.setText("Manage Inventory");
        btnManageInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageInventoryActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("WholeSaler Operations Panel");

        btnViewProduct.setText("View Product");
        btnViewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageInventory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnAddProduct)
                .addGap(18, 18, 18)
                .addComponent(btnViewProduct)
                .addGap(18, 18, 18)
                .addComponent(btnManageInventory)
                .addContainerGap(248, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
        AddProductJPanel addproductpanel = new AddProductJPanel(business, userProcessContainer);
        userProcessContainer.removeAll();
        userProcessContainer.add("AddProductJPanel", addproductpanel);
        ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnManageInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageInventoryActionPerformed
        // TODO add your handling code here:
        ManageInventoryJPanel manageproductpanel = new ManageInventoryJPanel(business, userProcessContainer);
        userProcessContainer.removeAll();
        userProcessContainer.add("ManageInventoryJPanel", manageproductpanel);
        ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_btnManageInventoryActionPerformed

    private void btnViewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductActionPerformed
        // TODO add your handling code here:
        ViewProductJPanel viewproduct = new ViewProductJPanel(business, userProcessContainer);
        userProcessContainer.removeAll();
        userProcessContainer.add("ViewProductJPanel", viewproduct);
        ((java.awt.CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_btnViewProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnManageInventory;
    private javax.swing.JButton btnViewProduct;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
