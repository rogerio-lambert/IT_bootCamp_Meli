package com.meli.bootcamp.modulo6.pratica1storageimplementationii.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MaterialDTO {
    private Integer id;
    private String name;
    private BigDecimal value;
}
