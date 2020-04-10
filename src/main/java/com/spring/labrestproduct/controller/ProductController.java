/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-09 19:55:24
 * @modify date 2020-04-10 23:15:23
 * @desc Controller containing various product related Get post methods
 */
package com.spring.labrestproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.spring.labrestproduct.entity.Product;
import com.spring.labrestproduct.repository.ProductRepository;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    /**
     * Used to access the product repository
     */
    @Autowired
    private ProductRepository respository;

    /**
     * Used to display all the products from the reository
     * 
     * @return List of All products
     */
    @GetMapping("/all")
    public List<Product> showAllProducts() {
        return respository.fetchAll();
    }

    /**
     * @param Product Save Data in product repository
     * @return Product with an ID
     */
    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Product saveProduct(@RequestBody Product product) {
        return respository.addProduct(product);
    }

}