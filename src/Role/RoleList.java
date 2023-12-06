/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import java.util.ArrayList;

/**
 *
 * @author zhaoyinhao
 */
public class RoleList {
    
    private ArrayList<Role> rolelist;

    public ArrayList<Role> getRolelist() {
        return rolelist;
    }

    public Role addrole(Role type) {
        rolelist.add(type);
        return type;
    }
    
    
}
