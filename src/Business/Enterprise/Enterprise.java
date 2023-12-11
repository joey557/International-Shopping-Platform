/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Employee.EmployeeDirectory;
import Business.Order.MasterOrderList;
import Business.Order.Order;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Product.Product;
import Business.Product.ProductDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author zhaoyinhao
 */
public class Enterprise{
    
    private String enterpriseType;
    private EmployeeDirectory employeelist;
    private OrganizationDirectory organizationDirectory;
    private String name;
    private String email;
    private String address;
    private UserAccount acc;
    private UserAccountDirectory eeacclist;
    private Order orderlist;
    private MasterOrderList masterorderlist;
    private ProductDirectory ecommerceproductlist;


    public Enterprise(){
        
        acc = new UserAccount();
        employeelist = new EmployeeDirectory();
        organizationDirectory = new OrganizationDirectory();
        eeacclist = new UserAccountDirectory();
        orderlist = new Order();
        masterorderlist = new MasterOrderList();
        ecommerceproductlist = new ProductDirectory();
         
    }

    public MasterOrderList getMasterorderlist() {
        return masterorderlist;
    }

    public void setMasterorderlist(MasterOrderList masterorderlist) {
        this.masterorderlist = masterorderlist;
    }
    
    
    public UserAccountDirectory getEeacclist() {
        return eeacclist;
    }

    public void setEeacclist(UserAccountDirectory eeacclist) {
        this.eeacclist = eeacclist;
    }

    public Order getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(Order orderlist) {
        this.orderlist = orderlist;
    }
    
    
    public EmployeeDirectory getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(EmployeeDirectory employeelist) {
        this.employeelist = employeelist;
    }
    
    
    public UserAccount getAcc() {
        return acc;
    }
    
    
    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ProductDirectory getEcommerceproductlist() {
        return ecommerceproductlist;
    }

    public void setEcommerceproductlist(ProductDirectory ecommerceproductlist) {
        this.ecommerceproductlist = ecommerceproductlist;
    }
   
    
    
}

