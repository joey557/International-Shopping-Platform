/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author zhaoyinhao
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriselist;
    private OrganizationDirectory organizationDirectory;

    public EnterpriseDirectory(){
         this.enterpriselist = new ArrayList<Enterprise>();
    }
    public ArrayList<Enterprise> getEnterpriselist() {
        return enterpriselist;
    }

    public Enterprise addNewenterprise() {
        Enterprise ep = new Enterprise();
        enterpriselist.add(ep);
        return ep;
    }
    
    public void deleteEpByName(String name) {
        for (int i = 0; i < enterpriselist.size(); i++) {
            if (enterpriselist.get(i).getName() == name) {
                enterpriselist.remove(i);
                return;
            }
        }
    }
    
    public Enterprise findEpByName(String name) {
        for (Enterprise ep: enterpriselist) {
            if (ep.getName().equals(name)) {
                return ep;
            }
        }
        return null;
    }
    
        public Enterprise findAccount(String username, String password){
        for (Enterprise ep : enterpriselist) {
            if (ep.getAcc().getUsername().equals(username) && ep.getAcc().getPassword().equals(password)) {
                return ep;
            }
        }
        return null;
    }
        
    
}
