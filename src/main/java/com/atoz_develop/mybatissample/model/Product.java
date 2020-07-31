package com.atoz_develop.mybatissample.model;

import lombok.*;

@NoArgsConstructor @RequiredArgsConstructor @Getter @Setter @ToString
public class Product {

    private Long prodId;
    @NonNull private String prodName;
    @NonNull private int prodPrice;
}
