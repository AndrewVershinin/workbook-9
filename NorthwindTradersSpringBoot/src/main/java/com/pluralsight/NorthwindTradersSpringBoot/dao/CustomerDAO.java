package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.model.Customer;
import java.util.List;

public interface CustomerDAO {
    List<Customer> getAll();
    List<Customer> getByCompanyName();
    List<Customer> getByContactName();
    List<Customer> getByAddress();
    Customer getByCustomerID();
    void delete();
    void add(Customer customer);
}