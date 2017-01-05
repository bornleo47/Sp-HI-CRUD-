/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anuk.crud.controllers;

import com.anuk.crud.bo.EmployeeBo;
import com.anuk.crud.model.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class EmployeeController {
    
    @Autowired
    private EmployeeBo b;
    
   
    
 @RequestMapping("/index")
    public String index(){
        return "index";

    }
  

    
    @RequestMapping("/empform")
	public ModelAndView showform(){
		return new ModelAndView("empform","command",new Employee());
	}
	



	
    @RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Employee emp)
        {
	b.createEmployee(emp);
        return new ModelAndView("redirect:/viewemp");
	}
        
        
        
	
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){
		List<Employee> list=b.selectAll();
		return new ModelAndView("viewemp","list",list);
	}
        
	
        
	@RequestMapping(value="/editemp/{id}")
	public ModelAndView edit(@PathVariable int id){
		Employee emp=b.selectEmployee(id);
		return new ModelAndView("empeditform","command",emp);
	}
	
        
   
	@RequestMapping(value="/editsave",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("emp") Employee emp){
		b.updateEmployee(emp);
		return new ModelAndView("redirect:/viewemp");
	}
	
        
        
  
	@RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		
            Employee emp = new Employee();
            emp.setId(id);
            b.deleteEmployee(emp);
		return new ModelAndView("redirect:/viewemp");
	}

}
    
    
