package com.example.tailorApp.tailorAppDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.tailorApp.tailorAppDemo.dao.CustomerDAO;
import com.example.tailorApp.tailorAppDemo.model.Customer;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerDAO custRepo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
		
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(Customer cust)
	{
		/*custRepo.findAll().iterator();
		cust.setCid(1);*/
		custRepo.save(cust);
		return "home.jsp";
		
	}
}
