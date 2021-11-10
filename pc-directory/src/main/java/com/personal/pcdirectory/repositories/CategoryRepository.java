/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.pcdirectory.repositories;

import com.personal.pcdirectory.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sharon98
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
