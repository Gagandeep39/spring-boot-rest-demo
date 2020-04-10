/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-10 23:37:58
 * @modify date 2020-04-10 23:37:58
 * @desc A Global error handler for all error in this application
 */
package com.spring.labrestproduct.exception;

import com.spring.labrestproduct.entity.ProductErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ControllerAdvice Similar to filter and Interceptor Preprocess request to
 *                   Controller, post process response(mostly exception)
 */
@ControllerAdvice
public class ProductRestErrorHandler {

    /**
     * Handle Product Exception
     * @param ProductNotFoundException Custom Exception thrown when a product is not found
     * @return Resturns a response object with an Error code
     */
    @ExceptionHandler
    public ResponseEntity<ProductErrorResponse> handleProductNotFound(ProductNotFoundException exception){
        ProductErrorResponse response = new ProductErrorResponse();
        response.setStatus(HttpStatus.NOT_FOUND.value());
        response.setTimeStamp(System.currentTimeMillis());
        response.setMessage(exception.getMessage());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    /**
     * @param Exception Handles all kinds of Exception
     * @return Returns a response object with an Error code
     * All generic exceptions will be caught by this error handler
     */
    @ExceptionHandler
    public ResponseEntity<ProductErrorResponse> handleAllError(Exception exception){
        ProductErrorResponse response = new ProductErrorResponse();
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        response.setTimeStamp(System.currentTimeMillis());
        response.setMessage(exception.getMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}