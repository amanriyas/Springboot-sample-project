package com.example.nobsv2.product.headers;

import com.example.nobsv2.product.model.Product;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

    @GetMapping("/headers")
    public String getRegionResponse(@RequestHeader(required = false, defaultValue = "US") String region){
        if(region.equals("US")) return "BALD EAGLE FREEDOM";
        if(region.equals("CA")) return "MAPLE SYRUP";

        return "country not supported";
    }
    @GetMapping(value = "headers/product", produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Product>  getProduct(){
      Product product = new Product();
      product.setId(1);
      product.setName("BALD EAGLE FREEDOM");
        product.setPrice(100.0);
        product.setDescription("A majestic symbol of freedom and strength, the Bald Eagle is a true American icon. This product embodies the spirit of the United States, representing resilience and independence. Perfect for those who cherish the values of liberty and patriotism.");

        return ResponseEntity.ok(product);
    }
}
