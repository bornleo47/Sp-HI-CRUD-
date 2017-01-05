
package com.anuk.crud.dao;

import com.anuk.crud.model.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author anukshakya
 */




@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
   
    @Autowired
    HibernateTemplate ht;

 
    @Override
    public void save(Employee e) 
    {
        ht.save(e);
       
    }

    @Override
    public boolean update(Employee e) 
    {
        
         ht.update(e);
        return true;
        
    }

    @Override
    public boolean delete(Employee e)  {
        
        ht.delete(e);
       return true; 
    }

    @Override
    public Employee find(int id)  {
        return (Employee) ht.get(Employee.class, id);    
        
    }
 
    @Override
    public List<Employee> findAll() 
    {
      
        return ht.loadAll(Employee.class);
      
    }

}