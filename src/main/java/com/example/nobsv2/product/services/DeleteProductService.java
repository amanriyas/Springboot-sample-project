package com.example.nobsv2.product.services;

import com.example.nobsv2.product.Command;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DeleteProductService implements Command<Void, String> {

    @Override
    public ResponseEntity<String> execute(Void input) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Delete product endpoint");
    }
}
