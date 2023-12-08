/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Product.Product;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author peifang
 */
public class Order {
    
    Map<Product, Integer> order;
    String status;

    public Map<Product, Integer> getOrder() {
        return order;
    }

    public void setOrder(Map<Product, Integer> order) {
        this.order = order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
