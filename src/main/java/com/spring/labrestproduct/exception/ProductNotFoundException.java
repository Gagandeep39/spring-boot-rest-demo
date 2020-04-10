/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-10 23:30:02
 * @modify date 2020-04-10 23:30:02
 * @desc Product Not found custom Exception thrown when invlaid ID is entered
 */
package com.spring.labrestproduct.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String message){
        super(message);
    }

}