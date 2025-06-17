package com.pluralsight.NorthwindTradersSpringBoot.service;

import com.pluralsight.NorthwindTradersSpringBoot.dao.ProductDAOJDBCImpl;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductDAOJDBCImpl productDao;

    @Autowired
    public ProductService(ProductDAOJDBCImpl productDao) {
        this.productDao = productDao;
    }

    public List<Product> getAllProducts() {
        return productDao.getAll();
    }

    public Product getProductById(int id) {
        return productDao.getById(id);
    }

    public List<Product> getByName(String name) {
        return productDao.getByName(name);
    }

    public List<Product> getByCategoryId(int categoryId) {
        return productDao.getByCategoryId(categoryId);
    }

    public List<Product> getByPrice(double price) {
        return productDao.getByPrice(price);
    }
}