/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface.Main;

import Business.Business;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author joey
 */
class ConfigureABusiness {
    
    static Business initialize(){
        Business business = new Business("International Shopping");
                
        UserAccountDirectory uadirectory = business.getUseracclist();    
        Employee ee = new Employee();
        Role role = new Role();
        role.setType("admin");
        UserAccount ua = uadirectory.createUser("admin", "XXXX", ee, role);
                
                
                
                
                
                
                
       
        return business;
    }
    
}
