package com.ecommerce.service;

import com.ecommerce.entity.Product;
import com.ecommerce.exception.ResourceNotFoundException;
import com.ecommerce.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(
            Product product) {

        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    public Product getProductById(
            Long id) {

        return productRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Product Not Found"));
    }

    public Product updateProduct(
            Long id,
            Product updatedProduct) {

        Product product =
                getProductById(id);

        product.setName(
                updatedProduct.getName());

        product.setDescription(
                updatedProduct.getDescription());

        product.setPrice(
                updatedProduct.getPrice());

        product.setQuantity(
                updatedProduct.getQuantity());

        return productRepository.save(product);
    }

    public void deleteProduct(
            Long id) {

        Product product =
                getProductById(id);

        productRepository.delete(product);
    }
}