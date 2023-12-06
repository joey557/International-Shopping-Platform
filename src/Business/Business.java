/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author zhaoyinhao
 */
public class Business {
    
    String name;
    Enterprise enterprise;
    EnterpriseDirectory enterpriselist;
    
    public Business(String n) {
        name = n;

        enterprise = new Enterprise();
        enterpriselist = new EnterpriseDirectory();

    }
    
    public Enterprise getEnterprise() {
        return enterprise;
    }

    public EnterpriseDirectory getEnterpriselist() {
        return enterpriselist;
    }
    
}
