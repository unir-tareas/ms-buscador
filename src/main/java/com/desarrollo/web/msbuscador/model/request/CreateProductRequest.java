package com.desarrollo.web.msbuscador.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

    private String name;
    private String imageUrl;
    private Float price;
    private Float discount;
    private Boolean enableDiscount;
    private Integer stock;
    private String description;
    private String category;
    private String brand;

}

