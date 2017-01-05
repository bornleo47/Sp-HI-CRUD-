/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anuk.crud.bo;

import com.anuk.crud.model.Employee;
import java.util.List;

/**
 *
 * @author anukshakya
 */
public interface EmployeeBo {
    
    
    public void createEmployee(Employee e);
    public boolean updateEmployee(Employee e);
    public boolean deleteEmployee(Employee e);
    public Employee selectEmployee(int id);
    public List<Employee> selectAll();
    
    
    
    
}
