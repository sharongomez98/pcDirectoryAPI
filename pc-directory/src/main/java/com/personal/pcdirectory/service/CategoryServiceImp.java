/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.pcdirectory.service;

import com.personal.pcdirectory.models.Category;
import com.personal.pcdirectory.repositories.CategoryRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sharon98
 */
@Service
public class CategoryServiceImp implements CategoryService{

    @Autowired
    public CategoryRepository categoryRepo;

    @Override
    @Transactional(readOnly = true)
    public Category getCategoryById(Long id) {
        return categoryRepo.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Category createCategory(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    @Transactional
    public Category updateCategory(Category newCategory, Long id) {
        return categoryRepo.findById(id)
                .map(category -> {
                    category.setName(newCategory.getName());
                    category.setDescription(newCategory.getDescription());
                    category.setImage(newCategory.getImage());
                    return categoryRepo.save(category);
                }).orElseGet(() ->{ return newCategory;});
    }

    @Override
    @Transactional
    public void deleteCategory(Long id) {
        Category category = categoryRepo.getById(id);
        categoryRepo.delete(category);
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Category> getAll() {
        return (ArrayList<Category>) categoryRepo.findAll();
    }



}
