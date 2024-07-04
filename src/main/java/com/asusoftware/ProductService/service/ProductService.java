package com.asusoftware.ProductService.service;

import com.asusoftware.ProductService.model.ProductRequest;
import com.asusoftware.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
