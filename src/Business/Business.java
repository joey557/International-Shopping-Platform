/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Order.MasterOrderList;
import Business.Order.Order;
import Business.Product.ProductDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author zhaoyinhao
 */
public class Business {
    
    String name;
    Enterprise enterprise;
    EnterpriseDirectory enterpriselist;
    ProductDirectory wholesalerproductlist;
    ProductDirectory ecommerceproductlist;
    MasterOrderList orderlist;
    UserAccountDirectory useracclist;

    public Business(String n) {
        name = n;

        enterprise = new Enterprise();
        enterpriselist = new EnterpriseDirectory();
        wholesalerproductlist = new ProductDirectory();
        ecommerceproductlist = new ProductDirectory();
        orderlist = new MasterOrderList();
        useracclist = new UserAccountDirectory();

    }
    
    public Enterprise getEnterprise() {
        return enterprise;
    }

    public EnterpriseDirectory getEnterpriselist() {
        return enterpriselist;
    }

    public ProductDirectory getWholesalerproductlist() {
        return wholesalerproductlist;
    }


    public ProductDirectory getEcommerceproductlist() {
        return ecommerceproductlist;
    }

    public MasterOrderList getOrderlist() {
        return orderlist;
    }

    public UserAccountDirectory getUseracclist() {
        return useracclist;
    }
    
    
}
