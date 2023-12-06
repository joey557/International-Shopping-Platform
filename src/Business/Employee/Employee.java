/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

/**
 *
 * @author zhaoyinhao
 */
public class Employee {
    
    private int id;
    private String name;
    private static int count = 1;
    
    public Employee() {
        id = count;
        count ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
}
