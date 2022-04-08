package com.meli.bootcamp.modulo6.pratica1storageimplementationii.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JewelryDTO {
    private Integer id;
    private Set<MaterialDTO> materials;
    private Double weight;
    private Integer carats; //quilates
}
