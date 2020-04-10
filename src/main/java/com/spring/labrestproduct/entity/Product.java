/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-09 19:55:29
 * @modify date 2020-04-09 20:14:45
 * @desc Produt bean
 */
package com.spring.labrestproduct.entity;

public class Product {

    private int productId;
    private String productName;
    private double productPrice;

    public Product() {

    }

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId(){
        return productId;
    }

    public double getProductPrice(){
        return productPrice;
    }

    public String getProductName(){
        return productName;
    }

    public void setId(int productId){
        this.productId = productId;
    }

    @Override
    public String toString(){
        return "productId: " + productId + ", productName: " + productName + ", productPrice" + productPrice;
    }

}