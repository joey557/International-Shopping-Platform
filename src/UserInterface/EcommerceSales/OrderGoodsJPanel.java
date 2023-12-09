/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.EcommerceSales;

import Business.Business;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joey
 */
public class OrderGoodsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewGoodsJPanel
     */
    UserAccount ua;
    Business business;
    JPanel CardSequencePanel;
    Order currentOrder;
    
    OrderGoodsJPanel(UserAccount ua, Business business, JPanel CardSequencePanel) {
        initComponents();
        this.ua = ua;
        this.business = business;
        this.CardSequencePanel = CardSequencePanel;
        
        this.currentOrder = new Order();
        populateProductTable();
        populateCartTable();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCarts = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddCart = new javax.swing.JButton();
        txtModQuan = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        btnCheckout = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ProductID", "Name", "Category", "Price", "Description", "Avail"
            }
        ));
        jScrollPane1.setViewportView(tblProduct);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("View Goods from Wholesaler");

        jLabel4.setText("Product Catalog:");

        tblCarts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ProductID", "Name", "Quantity", "TotalAmount"
            }
        ));
        jScrollPane2.setViewportView(tblCarts);

        jLabel5.setText("Item in carts:");

        jLabel6.setText("Quantity:");

        btnAddCart.setText("Add to Cart");
        btnAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCartActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnCheckout.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCheckout.setText("CheckOut");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        btnModify.setText("Modify Quantity:");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("Have a wonderful shopping experience!");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle.setIconTextGap(20);

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnModify)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtModQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnRemove))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAddCart)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddCart)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(64, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblTitle))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModify))
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCartActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblProduct.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the product first");
            return;
        }
        
        Product product = (Product) tblProduct.getValueAt(selectedRowIndex,0);
        int quant = 0;
        
        try {
            
            quant = (Integer) spnQuantity.getValue();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check the quantity fields.");
            return;
            
        }
        
        OrderItem item = currentOrder.findProduct(product);
        
        if (item == null) {
           
            if (product.getAvail() >= quant) {
                
                currentOrder.addNewOrderItem(product, quant);
                product.setAvail(product.getAvail() - quant);
                

            } else {
                JOptionPane.showMessageDialog(this, "Please check product availability.");
                return;
            }
            
        } else {
            
            int oldQuant = item.getQuantity();
            if (item.getProduct().getAvail() + oldQuant < quant) {
                JOptionPane.showMessageDialog(this, "Please check product availability.");
                return;
            }
            
            item.getProduct().setAvail(item.getProduct().getAvail()+oldQuant-quant);
            item.setQuantity(quant);
                  
        }
        
        populateProductTable();
        populateCartTable();
    }//GEN-LAST:event_btnAddCartActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCarts.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the order item first.");
            return;
        }
        
        OrderItem item = (OrderItem) tblCarts.getValueAt(selectedRowIndex, 0);
        int quant = 0;
        
        try {
            
            quant = Integer.parseInt(txtModQuan.getText());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check the modified quantity field.");
            return;
            
        }
        
        int oldQuant = item.getQuantity();
        if (item.getProduct().getAvail() + oldQuant < quant) {
                JOptionPane.showMessageDialog(this, "Please check product availability.");
                return;
        }
            
        item.getProduct().setAvail(item.getProduct().getAvail() + oldQuant - quant);
        item.setQuantity(quant);
        
        populateCartTable();
        populateProductTable();
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCarts.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the order item first.");
            return;
        }
        
        OrderItem item = (OrderItem) tblCarts.getValueAt(selectedRowIndex, 0);
        int quant = 0;
            
        item.getProduct().setAvail(item.getProduct().getAvail() + item.getQuantity());
        currentOrder.deleteItem(item);
        
        populateCartTable();
        populateProductTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // TODO add your handling code here:
        currentOrder.setStatus("Processing");
        // TODO
        //currentOrder.setCustomer("");
        
        ua.getMasterorderlist().addNewOrder(currentOrder);
        currentOrder = new Order();
        
        populateProductTable();
        populateCartTable();
        
        txtModQuan.setText("");
        spnQuantity.setValue(0);
        
        JOptionPane.showMessageDialog(this, "Thank you for your purchase. Looking forward to see you again!");
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EcommerceSalesMenuJPanel ecommercesalesarea = new EcommerceSalesMenuJPanel(ua, business, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("EcommerceSalesMenuJPanel", ecommercesalesarea);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCart;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblCarts;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtModQuan;
    // End of variables declaration//GEN-END:variables

    

    private void populateProductTable() {
        
        
        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        model.setRowCount(0);

        for (Product p : business.getWholesalerproductlist().getProductDirectory()) {
 
            Object row[] = new Object[4];
            row[0] = p.getId();
            row[1] = p.getName();
            row[2] = p.getCategory();
            row[3] = p.getPrice();
            row[4] = p.getDescription();
            row[5] = p.getQuantity();
            model.addRow(row);
         
        }
    }

    private void populateCartTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblCarts.getModel();
        model.setRowCount(0);

        for (OrderItem oi : currentOrder.getOrderItemList()) {
            Object row[] = new Object[4];
            row[0] = oi;
            row[1] = oi.getProduct().getPrice();
            row[2] = oi.getQuantity();
            row[3] = oi.getQuantity() * oi.getProduct().getPrice(); 
            model.addRow(row);
        }
        

    }
}
