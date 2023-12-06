/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhaoyinhao
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> useraccountlist;
    
    public UserAccountDirectory() {
        useraccountlist = new ArrayList();
    }

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }
    
    public UserAccount createUser(String username, String password, Employee employee, Role role) {
        UserAccount acc = new UserAccount();
        acc.setUsername(username);
        acc.setPassword(password);
        acc.setEmployee(employee);
        acc.setRole(role);
        useraccountlist.add(acc);
        return acc;
    }
    
    public UserAccount validateUser(String username, String password) {
        for (UserAccount acc: useraccountlist){
            if (acc.getUsername().equals(username) && acc.getPassword().equals(password)) {
                return acc;
            }
        }
        return null;
    }
    
    
}
