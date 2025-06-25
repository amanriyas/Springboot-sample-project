package com.example.nobsv2.exceptions;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(){
        super(ErrorMessages.PRODUCT_NOT_FOUND.getMessage());
    }
}

