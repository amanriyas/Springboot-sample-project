package com.example.nobsv2.product;

import com.example.nobsv2.product.model.Product;
import com.example.nobsv2.product.services.CreateProductServices;
import com.example.nobsv2.product.services.DeleteProductService;
import com.example.nobsv2.product.services.GetProductService;
import com.example.nobsv2.product.services.UpdateProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final CreateProductServices createProductServices;


    private final GetProductService getProductService;


    private final UpdateProductService updateProductService;


    private final DeleteProductService deleteProductService;



    public ProductController(CreateProductServices createProductServices,
                             GetProductService getProductService,
                             UpdateProductService updateProductService,
                             DeleteProductService deleteProductService)
    {
        this.createProductServices = createProductServices;
        this.getProductService = getProductService;
        this.updateProductService = updateProductService;
        this.deleteProductService = deleteProductService;
    }




   @GetMapping
    public ResponseEntity<List<Product>> getProduct() {
       return getProductService.execute(null);
   }

   @PostMapping
    public ResponseEntity<String> postProduct() {
        return createProductServices.execute(null);
   }

   @PutMapping
    public ResponseEntity<String> putProduct2() {
        return updateProductService.execute(null);
   }

   @DeleteMapping
    public ResponseEntity<String> deleteProduct() {
       return deleteProductService.execute(null);
   }
}
