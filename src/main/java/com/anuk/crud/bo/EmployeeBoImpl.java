/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anuk.crud.bo;

import com.anuk.crud.dao.EmployeeDao;
import com.anuk.crud.model.Employee;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anukshakya
 */

@Service
@Transactional
public class EmployeeBoImpl implements EmployeeBo{
    
    @Autowired
    private EmployeeDao dao;

    @Override
    public void createEmployee(Employee e) 
    {
        dao.save(e);
    }


    @Override
    public boolean updateEmployee(Employee e)  {
        return dao.update(e);
       
    }

    @Override
    public boolean deleteEmployee(Employee e)  {
        return dao.delete(e);
    }

    @Override
    public Employee selectEmployee(int id)  {
        return dao.find(id);
    }

    @Override
    public List<Employee> selectAll()  
    {
        return dao.findAll();
    }
    
    
}
