package com.example.nobsv2.product;

import com.example.nobsv2.product.model.Product;
import com.example.nobsv2.product.model.ProductDTO;
import com.example.nobsv2.product.model.UpdateProductCommand;
import com.example.nobsv2.product.services.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final CreateProductServices createProductServices;


    private final GetProductsService getProductsService;


    private final UpdateProductService updateProductService;


    private final DeleteProductService deleteProductService;

    private final GetProductService getProductService;


    public ProductController(CreateProductServices createProductServices,
                             GetProductsService getProductsService,
                             UpdateProductService updateProductService,
                             DeleteProductService deleteProductService,
                             GetProductService getProductService)
    {
        this.createProductServices = createProductServices;
        this.getProductsService = getProductsService;
        this.updateProductService = updateProductService;
        this.deleteProductService = deleteProductService;
        this.getProductService = getProductService;
    }

   @GetMapping("/products")
    public ResponseEntity<List<ProductDTO>> getProducts() {
       return getProductsService.execute(null);
   }

   @GetMapping("/product/{id}")
   public ResponseEntity<ProductDTO> getProductbyId(@PathVariable Integer id) {
       return getProductService.execute(id);
   }

   @PostMapping("/product")
    public ResponseEntity<ProductDTO> postProduct(@RequestBody Product product) {

        return createProductServices.execute(product);
   }

   @PutMapping("/product/{id}")
    public ResponseEntity<ProductDTO> putProduct2(@PathVariable Integer id, @RequestBody Product product) {
        return updateProductService.execute(new UpdateProductCommand(id, product));
   }

   @DeleteMapping("/product/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id) {
       return deleteProductService.execute(id);
   }
}
