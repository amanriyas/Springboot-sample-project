package com.example.nobsv2.validators;

import com.example.nobsv2.exceptions.ErrorMessages;
import com.example.nobsv2.exceptions.ProductNotValidException;
import com.example.nobsv2.product.model.Product;
import org.springframework.util.StringUtils;

public class ProductValidator {

    private ProductValidator() {}
    public static void execute(Product product) {
        if (StringUtils.hasText(product.getName())) {

            throw new ProductNotValidException(ErrorMessages.NAME_REQUIRED.getMessage());

        }
        if (product.getDescription().length()<20){
            throw new ProductNotValidException(ErrorMessages.DESCRIPTION_LENGTH.getMessage());
        }

        if (product.getPrice() <= 0 || product.getPrice() == null) {
            throw new ProductNotValidException(ErrorMessages.PRICE_INVALID.getMessage());
        }
    }
}
