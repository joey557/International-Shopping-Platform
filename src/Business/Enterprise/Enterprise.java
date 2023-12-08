/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Employee.EmployeeDirectory;
import Business.Order.OrderDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
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
    private OrderDirectory orderlist;

    public Enterprise(){
        
        acc = new UserAccount();
        employeelist = new EmployeeDirectory();
        organizationDirectory = new OrganizationDirectory();
        eeacclist = new UserAccountDirectory();
        orderlist = new OrderDirectory();
         
    }

    public UserAccountDirectory getEeacclist() {
        return eeacclist;
    }

    public void setEeacclist(UserAccountDirectory eeacclist) {
        this.eeacclist = eeacclist;
    }

    public OrderDirectory getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(OrderDirectory orderlist) {
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
    
    
    
}

