/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface.Main;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import UserInterface.AccountingRole.ViewRevenueReportJPanel;
import UserInterface.AdminRole.AdminMenuJPanel;
import UserInterface.EcommerceContactTeam.EcoCTMenuJPanel;
import UserInterface.EcommerceOperation.EcoViewProductJPanel;
import UserInterface.EcommerceOperation.EcommerceOperationMenuJPanel;
import UserInterface.EcommerceSales.EcommerceSalesMenuJPanel;
import UserInterface.ShippingCompanySalesRole.ViewOrderJPanel;
import UserInterface.SystemAdminRole.SystemAdminMenuJPanel;
import UserInterface.WholesalerCustomerServiceRole.CustomerServiceMenuJPanel;
import UserInterface.WholesalerOperationRole.WholesalerOperationMenuJPanel;
import UserInterface.WholesalerSalesRole.ManageOrderJPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author peifang
 */
public class WorkAreaMainJFrame extends javax.swing.JFrame {

    Business business;

    /**
     * Creates new form WorkAreaMainJFrame
     */
    public WorkAreaMainJFrame() {
        initComponents();
        business = ConfigureABusiness.initialize();
        setSize(1100, 800);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        actionsidePanel = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        CardSequencePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actionsidePanel.setBackground(new java.awt.Color(204, 227, 222));

        txtUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionsidePanelLayout = new javax.swing.GroupLayout(actionsidePanel);
        actionsidePanel.setLayout(actionsidePanelLayout);
        actionsidePanelLayout.setHorizontalGroup(
            actionsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionsidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actionsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword)
                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, actionsidePanelLayout.createSequentialGroup()
                        .addGroup(actionsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        actionsidePanelLayout.setVerticalGroup(
            actionsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsidePanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(actionsidePanel);

        CardSequencePanel.setBackground(new java.awt.Color(234, 244, 244));
        CardSequencePanel.setLayout(new java.awt.CardLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/homepage.png"))); // NOI18N
        CardSequencePanel.add(jLabel3, "card2");

        jSplitPane1.setRightComponent(CardSequencePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String un = txtUsername.getText();
        char[] pwArr = txtPassword.getPassword();
        String pw = new String(pwArr);
        
        
        EnterpriseDirectory eplist = business.getEnterpriselist();
        boolean isUserFound = false;
//        OrganizationDirectory orgDir = enterprise.getOrganizationDirectory();
        
       
        
        
        
        
        if (eplist.findAccount(un, pw)!=null) {
            Enterprise ep = eplist.findAccount(un, pw);
            AdminMenuJPanel adminworkarea = new AdminMenuJPanel(ep, business, CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("AdminMenuJPanel", adminworkarea);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
            isUserFound = true;
        } else if (un.equals("admin") && pw.equals("XXXX")) {
            SystemAdminMenuJPanel systemadminworkarea = new SystemAdminMenuJPanel(business, CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("SystemAdminMenuJPanel", systemadminworkarea);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
            isUserFound = true;
        } else {
       
            for (Enterprise enterprise : eplist.getEnterpriselist()) {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationlist()) {
                    UserAccountDirectory uad = org.getAcclist();
                    UserAccount userAccount = uad.validateUser(un, pw);

                    if (userAccount != null) {
                        String roleType = userAccount.getRole().getType();
                        String enterpriseType = enterprise.getEnterpriseType();

                        if (enterpriseType.equals("E-commerce platform") && roleType.equals("Operation")) {
                            EcommerceOperationMenuJPanel ecommeroperation = new EcommerceOperationMenuJPanel(enterprise, business, CardSequencePanel);
                            CardSequencePanel.removeAll();
                            CardSequencePanel.add("EcommerceOperationMenuJPanel", ecommeroperation);
                            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                            isUserFound = true;
                            break;
                        } else if (enterpriseType.equals("Wholesaler") && roleType.equals("Operation")) {
                            WholesalerOperationMenuJPanel wholeoperworkarea = new WholesalerOperationMenuJPanel(business, CardSequencePanel);
                            CardSequencePanel.removeAll();
                            CardSequencePanel.add("WholesalerOperationMenuJPanel", wholeoperworkarea);
                            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                            isUserFound = true;
                            break;
                        } else if (enterpriseType.equals("Wholesaler") && roleType.equals("Sales")) {
                            ManageOrderJPanel manageorder = new ManageOrderJPanel(business, CardSequencePanel);
                            CardSequencePanel.removeAll();
                            CardSequencePanel.add("ManageOrderJPanel", manageorder);
                            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                            isUserFound = true;
                            break;
                        } else if (enterpriseType.equals("E-commerce platform") && roleType.equals("Sales")) {
                            EcommerceSalesMenuJPanel manageorder = new EcommerceSalesMenuJPanel(enterprise, userAccount, business, CardSequencePanel);
                            CardSequencePanel.removeAll();
                            CardSequencePanel.add("EcommerceSalesMenuJPanel", manageorder);
                            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                            isUserFound = true;
                            break;
                            
                        } else if (enterpriseType.equals("Shipping and Delivery Company") && roleType.equals("Sales")) {
                            ViewOrderJPanel vieworder = new ViewOrderJPanel( business, CardSequencePanel);
                            CardSequencePanel.removeAll();
                            CardSequencePanel.add("ViewOrderJPanel", vieworder);
                            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                            isUserFound = true;
                            break;
                        } else if (enterpriseType.equals("E-commerce platform") && roleType.equals("ContactTeam")) {
                            EcoCTMenuJPanel ecomenu = new EcoCTMenuJPanel(enterprise, userAccount, business, CardSequencePanel);
                            CardSequencePanel.removeAll();
                            CardSequencePanel.add("EcoCTMenuJPanel", ecomenu);
                            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                            isUserFound = true;
                            break;
                        } else if (enterpriseType.equals("Wholesaler") && roleType.equals("ContactTeam")) {
                            CustomerServiceMenuJPanel servicemenu = new CustomerServiceMenuJPanel(enterprise, userAccount, business, org, CardSequencePanel);
                            CardSequencePanel.removeAll();
                            CardSequencePanel.add("CustomerServiceMenuJPanel", servicemenu);
                            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                            isUserFound = true;
                            break;  
                            
                      
                        }else if (enterpriseType.equals("Wholesaler") && roleType.equals("Accountant")) {
                            ViewRevenueReportJPanel acct = new ViewRevenueReportJPanel( userAccount, business, CardSequencePanel);
                            CardSequencePanel.removeAll();
                            CardSequencePanel.add("ViewRevenueReportJPanel", acct);
                            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                            isUserFound = true;
                            break;
                        // Add more conditions for other enterprise types and roles
                        }   
                    }
                
                }
            }
        if (!isUserFound) {
             JOptionPane.showMessageDialog(this, "Invalid username, password, or user not found.");
        }

        txtUsername.setText("");
        txtPassword.setText("");
        }

  
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LogoutJPanel logoutworkarea = new LogoutJPanel(business, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("LogoutJPanel", logoutworkarea);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WorkAreaMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkAreaMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkAreaMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkAreaMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkAreaMainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequencePanel;
    private javax.swing.JPanel actionsidePanel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
