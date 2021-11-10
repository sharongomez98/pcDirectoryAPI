/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.pcdirectory.repositories;

import com.personal.pcdirectory.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sharon98
 */
@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
//    @Query(value = "SELECT idBrand FROM Brand WHERE idComponent = :idComponent", nativeQuery = true)
//    ArrayList<Long> queryByComponentId(@Param("idBrand") Long idBrand);
}
