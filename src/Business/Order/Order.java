/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Order.OrderItem;
import Business.Product.Product;
import java.util.ArrayList;

/**
 *
 * @author peifang
 */
public class Order {
    
    
    ArrayList<OrderItem> orderItemList;
    private int id;
    private static int count = 1;
    private String status;
    private String customer;
    
    public Order() {
        this.orderItemList = new ArrayList<OrderItem>();  
        id = count;
        count ++;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getId() {
        return id;
    }
    
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public void addNewOrderItem(Product product, int quantity){
        OrderItem orderItem = new OrderItem(product, quantity);
        orderItemList.add(orderItem);
    }
    
    public void deleteItem(OrderItem item){
        this.orderItemList.remove(item);
    }
    
    public OrderItem findProduct(Product product){
        
        for (OrderItem oi : this.getOrderItemList()){
            if (oi.getProduct().equals(product)){
                return oi;
            }
        }
        return null;
    }
    
    public int Totalamount() {
        int count = 0;
        for (OrderItem orderitem : orderItemList) {
            count += orderitem.getQuantity() * orderitem.getProduct().getPrice(); 
        }
        return count;
    }
    
    @Override
    public String toString() {
        return customer;
    }
}
