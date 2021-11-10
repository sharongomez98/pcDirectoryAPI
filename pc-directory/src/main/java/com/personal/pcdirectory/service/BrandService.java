/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.pcdirectory.service;

import com.personal.pcdirectory.models.Brand;
import java.util.ArrayList;

/**
 *
 * @author sharon98
 */
public interface BrandService{

    public Brand getBrandById(Long id);

    //public Set<Brand> getBrandByComponent(Long id);

    public Brand createBrand(Brand brand);

    public Brand updateBrand(Brand brand, Long id);

    public void deleteBrand(Long id);

    public ArrayList<Brand> getAll();
}
