/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author zhaoyinhao
 */
public class OrderWorkRequest extends WorkRequest{
    
    private String Orderstatus;

    public String getOrderstatus() {
        return Orderstatus;
    }

    public void setOrderstatus(String Orderstatus) {
        this.Orderstatus = Orderstatus;
    }

}
