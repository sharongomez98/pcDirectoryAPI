/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personal.pcdirectory.dtos;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;

/**
 *
 * @author sharon98
 */
@Data
public class BrandDto {
    private Integer id;

    private String name;

    private String description;

    private String image;

    private Set<ComponentDto> components = new HashSet<>();
}
