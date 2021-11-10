/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.pcdirectory.controllers;

import com.personal.pcdirectory.models.Brand;
import com.personal.pcdirectory.service.BrandService;
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
@RequestMapping(value = "/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/")
    List<Brand> getBrandList(){
        return brandService.getAll();
    }

//    @GetMapping("/brand/{id}")
//    Set<Brand> getBrandByComponent(@PathVariable Long id){
//        return brandService.getBrandByComponent(id);
//    }

    @GetMapping("/{id}")
    Brand getBrandById(@PathVariable Long id){
        return brandService.getBrandById(id);
    }

    @PostMapping(value = "/")
    Brand createBrand(@RequestBody Brand brand){
        return brandService.createBrand(brand);
    }

    @PutMapping("/{id}")
    Brand updateBrand(@RequestBody Brand brand, @PathVariable Long id) {
        return brandService.updateBrand(brand, id);
    }

    @DeleteMapping("/{id}")
    void deleteBrand(@PathVariable Long id){
        brandService.deleteBrand(id);
    }
}
