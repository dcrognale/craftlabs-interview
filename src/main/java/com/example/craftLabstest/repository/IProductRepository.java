package com.example.craftLabstest.repository;

import com.example.craftLabstest.model.Product;
import java.util.List;
import jdk.jshell.spi.ExecutionControl;

public interface IProductRepository {

  List<Product> GetProducts();

  Product GetById(Long id);

  void Save(Product entity) throws ExecutionControl.NotImplementedException;

}
