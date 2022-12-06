package com.example.craftLabstest.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

  private Long id;
  private Double price;
  private String name;
}
