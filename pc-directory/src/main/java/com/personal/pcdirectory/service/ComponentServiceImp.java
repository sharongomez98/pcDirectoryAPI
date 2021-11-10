/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.pcdirectory.service;

import com.personal.pcdirectory.models.Component;
import com.personal.pcdirectory.repositories.ComponentRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sharon98
 */
@Service
public class ComponentServiceImp implements ComponentService {

    @Autowired
    public ComponentRepository componentRepo;

    @Override
    @Transactional(readOnly = true)
    public Component getComponentById(Long id) {
        return componentRepo.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Component createComponent(Component component) {
        return componentRepo.save(component);
    }

    @Override
    public Component updateComponent(Component newComponent, Long id) {
        return componentRepo.findById(id)
                .map(component -> {
                    component.setName(newComponent.getName());
                    component.setDescription(newComponent.getDescription());
                    component.setImage(newComponent.getImage());
                    component.setIdBrand(newComponent.getIdBrand());
                    component.setIdCategory(newComponent.getIdCategory());
                    return componentRepo.save(component);
                }).orElseGet(() ->{ return newComponent;});
    }

    @Override
    @Transactional
    public void deleteComponent(Long id) {
        Component component = componentRepo.getById(id);
        componentRepo.delete(component);
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Component> getAll() {
        return (ArrayList<Component>) componentRepo.findAll();
    }

}
