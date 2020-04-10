/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-09 19:46:25
 * @modify date 2020-04-09 20:14:27
 * @desc This class acts as a Database for Proucts
 */
package com.spring.labrestproduct.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring.labrestproduct.entity.Product;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;


@Component
public class ProductRepository{

    List<Product> products;

    /**
     * Constructor to populate the product list
     */
    ProductRepository(){
        products = new ArrayList<>();
        products.add(new Product(101, "One Plus 7 Pro", 52000.0));
        products.add(new Product(102, "One Plus 7", 30000.0));
        products.add(new Product(103, "Poco F1", 22000.0));
        products.add(new Product(104, "Redmi K20 Pro", 23000.0));
        products.add(new Product(105, "Acer Predator 300", 65000.0));
        products.add(new Product(106, "Kellog's Granola", 399.0));
        products.add(new Product(107, "Muesli Fruit and Nut", 340.0));
        products.add(new Product(108, "Boat Earphones", 1000.0));
        products.add(new Product(109, "NoteBook", 40.0));
        products.add(new Product(110, "Ball Pen", 5.0));
    }

    /**
     * 
     * @return Returns List of All products
     */
    public List<Product> fetchAll(){
        return products;
    }

    /**
     * @return Returs the product added to database
     */
	public Product addProduct(Product product) {
        product.setId(products.size()+1);
        products.add(product);
		return product;
	}
}