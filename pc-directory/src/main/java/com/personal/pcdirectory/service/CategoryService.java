/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.pcdirectory.service;

import com.personal.pcdirectory.models.Category;
import java.util.ArrayList;

/**
 *
 * @author sharon98
 */
public interface CategoryService {
    public Category getCategoryById(Long id);

    //public Set<Category> getBrandByComponent(Long id);

    public Category createCategory(Category category);

    public Category updateCategory(Category category, Long id);

    public void deleteCategory(Long id);

    public ArrayList<Category> getAll();
}
