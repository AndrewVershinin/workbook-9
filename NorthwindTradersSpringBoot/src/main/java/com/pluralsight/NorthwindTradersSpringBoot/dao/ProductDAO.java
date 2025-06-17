package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import java.util.List;

public interface ProductDAO {
    List<Product> getAll();
    Product getById(int id);
    List<Product> getByName(String name);
    List<Product> getByCategoryId(int categoryId);
    List<Product> getByPrice(double price);
}