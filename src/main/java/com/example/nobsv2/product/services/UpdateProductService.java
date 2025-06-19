package com.example.nobsv2.product.services;


import com.example.nobsv2.product.Command;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UpdateProductService implements Command<Void , String> {

    @Override
    public ResponseEntity<String> execute(Void input) {
        return ResponseEntity.ok("Product updated successfully");
    }
}
