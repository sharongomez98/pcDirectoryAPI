/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.pcdirectory.service;

import com.personal.pcdirectory.models.Component;
import java.util.ArrayList;

/**
 *
 * @author sharon98
 */
public interface ComponentService {
    public Component getComponentById(Long id);

    //public Set<Brand> getBrandByComponent(Long id);

    public Component createComponent(Component component);

    public Component updateComponent(Component component, Long id);

    public void deleteComponent(Long id);

    public ArrayList<Component> getAll();
}
