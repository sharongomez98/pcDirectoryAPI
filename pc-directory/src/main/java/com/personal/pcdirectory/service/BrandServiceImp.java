/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.pcdirectory.service;

import com.personal.pcdirectory.models.Brand;
import com.personal.pcdirectory.repositories.BrandRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sharon98
 */
@Service
public class BrandServiceImp implements BrandService {

    @Autowired
    public BrandRepository brandRepo;
//    @Autowired
//    public AnimeRepository animeRepo;

    @Override
    @Transactional(readOnly = true)
    public Brand getBrandById(Long id){
        return brandRepo.findById(id).orElse(null);
    }

//    @Override
//    @Transactional(readOnly = true)
//    public Set<Brand> getBrandByComponent(Long id){
//        Anime anime = animeRepo.findById(id).orElse(null);
//        if (anime == null){
//            return null;
//        }
//        return anime.getGenres();
//        return null;
//    }

    @Override
    @Transactional
    public Brand createBrand(Brand brand){
        return brandRepo.save(brand);
    }

    @Override
    @Transactional
    public Brand updateBrand(Brand newBrand, Long id){
        return brandRepo.findById(id)
                .map(brand -> {
                    brand.setName(newBrand.getName());
                    brand.setDescription(newBrand.getDescription());
                    brand.setImage(newBrand.getImage());
                    return brandRepo.save(brand);
                }).orElseGet(() ->{ return newBrand;});
    }

    @Override
    @Transactional
    public void deleteBrand(Long id){
        Brand brand = brandRepo.getById(id);
        brandRepo.delete(brand);
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Brand> getAll(){
        return (ArrayList<Brand>) brandRepo.findAll();
    }
}
