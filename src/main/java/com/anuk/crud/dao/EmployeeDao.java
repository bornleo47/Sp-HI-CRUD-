/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anuk.crud.dao;

import com.anuk.crud.model.Employee;
import java.util.*;

/**
 *
 * @author anukshakya
 */
public interface EmployeeDao 
{
    
    
    public void save(Employee e);
    public boolean update(Employee e);
    public boolean delete(Employee e);
    public Employee find(int id);
    public List<Employee> findAll();
    
    
    
}
