package com.ecommerce.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Data
@NoArgsConstructor
public class GenericProduct {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int price;


    public GenericProduct(String name, int price) {
        this.name = name;
        this.price = price;
    }


    @GetMapping("/generate")
    public ResponseEntity generateData() {
           return ResponseEntity.ok().build();
    }
}
