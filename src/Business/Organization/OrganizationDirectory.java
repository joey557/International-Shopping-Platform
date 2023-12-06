/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author zhaoyinhao
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationlist;
    
    public OrganizationDirectory() {
        organizationlist = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationlist() {
        return organizationlist;
    }
    
}
