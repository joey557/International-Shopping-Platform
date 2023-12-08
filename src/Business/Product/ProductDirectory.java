/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author peifang
 */
public class ProductDirectory {
    
    private ArrayList<Product> productlist;
    
    public ProductDirectory() {
        productlist = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductDirectory() {
        return productlist;
    }
    
    public Product addProduct() {
        Product p = new Product();
        productlist.add(p);
        return p;
    }
    
    public void removeProduct(Product p) {
        productlist.remove(p);
    }
    
    public Product searchProduct(String name) {

        for(Product p : productlist) {
            if(p.getName() == name) {
                return p;
            }
        }
        return null;
    }
    
    public int getProductCount(){
        return productlist.size();
    }
}
