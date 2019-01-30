package com.example.tailorApp.tailorAppDemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.tailorApp.tailorAppDemo.model.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Integer>{

}
