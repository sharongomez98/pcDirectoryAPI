/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.pcdirectory.repositories;

import com.personal.pcdirectory.models.Component;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sharon98
 */
public interface ComponentRepository extends JpaRepository<Component, Long> {

}
