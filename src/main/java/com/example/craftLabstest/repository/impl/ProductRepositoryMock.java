package com.example.craftLabstest.repository.impl;

import com.example.craftLabstest.model.Product;
import com.example.craftLabstest.repository.IProductRepository;
import java.util.List;
import jdk.jshell.spi.ExecutionControl;

public class ProductRepositoryMock implements IProductRepository {

  public ProductRepositoryMock(){

  }

  @Override
  public List<Product> GetProducts() {
    var p1 = Product.builder().id(123456789l).name("Product 1").build();
    var p2 = Product.builder().id(111111111l).name("Product 2").build();
    var p3 = Product.builder().id(222222222l).name("Product 3").build();

    return List.of(p1, p2, p3);
  }

  @Override
  public Product GetById(Long id) {
    var products = GetProducts();
    return products.stream().filter(p -> id.equals(p.getId())).findFirst().get();
  }

  @Override
  public void Save(Product entity) throws ExecutionControl.NotImplementedException {
    throw new ExecutionControl.NotImplementedException("Error");
  }
}
