
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.anuk.crud.model.Employee;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anukshakya
 */
public class test {
    
   //for testing the hibernate properties..... 
    
    public static void main(String[] args)
    {
    
    
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory sf = cfg.buildSessionFactory();
    Session s = sf.openSession();
    
    
    Employee e = new Employee();
    e.setName("Anuk");
    e.setAddress("Swoyambhu");
    e.setEmail("bornleo47@gmail.com");
    e.setPhone("9840068477");
    
   s.save(e);
   
   
 Transaction t = s.beginTransaction();
 t.commit();
 
 
 s.close();
 sf.close();
    
    
    
    
    
    }
}
