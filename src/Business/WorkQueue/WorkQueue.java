/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author zhaoyinhao
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workreqlist;
    
    public WorkQueue() {
        workreqlist = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkreqlist() {
        return workreqlist;
    }
    
}
