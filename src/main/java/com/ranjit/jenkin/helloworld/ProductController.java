package com.ranjit.jenkin.helloworld;

import com.ranjit.jenkin.helloworld.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @GetMapping("/products")
    public List<Product> listProducts() {
        final List<Product> products = Arrays.asList(
                new Product("Mango", 12.2),
                new Product("Orange", 15.2)
        );

        return products;
    }
}
