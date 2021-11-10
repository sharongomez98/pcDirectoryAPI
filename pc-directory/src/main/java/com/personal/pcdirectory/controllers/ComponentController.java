/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.pcdirectory.controllers;

import com.personal.pcdirectory.models.Component;
import com.personal.pcdirectory.service.ComponentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sharon98
 */
@RestController
//@CrossOrigin("http://localhost:8080")
@RequestMapping(value = "/component")
public class ComponentController {

    @Autowired
    private ComponentService componentService;

    @GetMapping("/")
    List<Component> getComponentList(){
        return componentService.getAll();
    }

    @GetMapping("/{id}")
    Component getComponentById(@PathVariable Long id){
        return componentService.getComponentById(id);
    }

    @PostMapping(value = "/")
    Component createComponent(@RequestBody Component component){
        return componentService.createComponent(component);
    }

    @PutMapping("/{id}")
    Component updateComponent(@RequestBody Component component, @PathVariable Long id) {
        return componentService.updateComponent(component, id);
    }

    @DeleteMapping("/{id}")
    void deleteCategory(@PathVariable Long id){
        componentService.deleteComponent(id);
    }

}
