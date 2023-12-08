/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author zhaoyinhao
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeelist;
    
    public EmployeeDirectory() {
        employeelist = new ArrayList();
    }

    public Employee addnewperson(String name, int id){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setId(id);
        employeelist.add(employee);
        return employee;
    }
    
    
    public ArrayList<Employee> getEmployeelist() {
        return employeelist;
    }
    
    public Employee findEEById(int id) {
        for (Employee ee: employeelist) {
            if (ee.getId() == id) {
                return ee;
            }
        }
        return null;
    }
}
