/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author peifang
 */
public class OrderDirectory {
    
    private ArrayList<Order> orderlist;
    
    public OrderDirectory() {
        orderlist = new ArrayList<Order>();
    }

    public ArrayList<Order> getProductDirectory() {
        return orderlist;
    }
    
    public Order addOrder() {
        Order order = new Order();
        orderlist.add(order);
        return order;
    }
    
    public void removeOrder(Order order) {
        orderlist.remove(order);
    }
    
   
}
