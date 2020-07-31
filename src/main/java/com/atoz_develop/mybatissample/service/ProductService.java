package com.atoz_develop.mybatissample.service;

import com.atoz_develop.mybatissample.model.Product;
import com.atoz_develop.mybatissample.repository.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    public Product getProductById(Long id) {

        return productMapper.selectProductById(id);
    }

    public List<Product> getAllProducts() {

        return productMapper.selectAllProducts();
    }

    @Transactional
    public void addProduct(Product product) {

        productMapper.insertProduct(product);
    }
}
