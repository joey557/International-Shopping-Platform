/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author zhaoyinhao
 */
public class Organization {
    
    public String name;
    private UserAccountDirectory acclist;
    private WorkQueue workqueue;
    
//    Organization(String orgname) {
//        
//        this.name = orgname;
//        this.acclist = new UserAccountDirectory();
//        this.workqueue = new WorkQueue();
//        
//    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getAcclist() {
        return acclist;
    }

    public void setAcclist(UserAccountDirectory acclist) {
        this.acclist = acclist;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }
    
           
}
