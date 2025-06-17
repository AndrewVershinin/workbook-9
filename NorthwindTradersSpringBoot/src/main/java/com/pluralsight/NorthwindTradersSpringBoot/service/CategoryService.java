package com.pluralsight.NorthwindTradersSpringBoot.service;

import com.pluralsight.NorthwindTradersSpringBoot.dao.CategoryDAOJDBCImpl;
import com.pluralsight.NorthwindTradersSpringBoot.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryDAOJDBCImpl categoryDao;

    @Autowired
    public CategoryService(CategoryDAOJDBCImpl categoryDao) {
        this.categoryDao = categoryDao;
    }

    public List<Category> getAllCategories() {
        return categoryDao.getAll();
    }

    public Category getCategoryById(int id) {
        return categoryDao.getById(id);
    }

    public List<Category> getByName(String name) {
        return categoryDao.getByName(name);
    }
}