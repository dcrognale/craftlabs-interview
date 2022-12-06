package com.example.craftLabstest.controllers;

import com.example.craftLabstest.model.Product;
import com.example.craftLabstest.repository.IProductRepository;
import com.example.craftLabstest.repository.impl.ProductRepositoryMock;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  @Autowired
  private IProductRepository mockBean;

  @GetMapping("/products")
  @ResponseBody
  private List<Product> getProducts(){
    //mockBean.getProducts();
    return Collections.emptyList();
  }
}
