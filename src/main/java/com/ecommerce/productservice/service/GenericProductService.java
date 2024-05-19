package com.ecommerce.productservice.service;


import com.ecommerce.productservice.models.GenericProduct;
import com.ecommerce.productservice.repository.GenericProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//import static com.sun.beans.introspect.PropertyInfo.Name.bound;

@Service
public class GenericProductService {


    private final GenericProductRepository genericProductRepository;

    public GenericProductService(GenericProductRepository genericProductRepository){
        this.genericProductRepository = genericProductRepository;
    }


    private static final String[] PRODUCT_NAME ={

            "Iphone 12",
            "Samsung Galaxy S21",
            "Macbook Pro",
            "Dell XPS 13",
            "Sony WH-1000XM4",
            "Apple Airpods Pro",
            "Apple Watch Series 6",
            "Samsung Galaxy Watch 3",
            "Sony A7 III",
            "Canon EOS R5",
            "Product A",
            "Product B",
            "Product C",
            "Product D",
            "Product E",
            "Product F",
            "Product G",
            "Product H",
            "Product I",
            "Product J"
    };

    public boolean generateProductData(){
        List<GenericProduct> productList = new ArrayList<>();
        Random random = new Random();

        for(int i=0; i<20; i++){
            String productName = PRODUCT_NAME[i];
            int price = random.nextInt(10000);

            GenericProduct genericProduct = new GenericProduct(productName, price);
            productList.add(genericProduct);




        }
        genericProductRepository.saveAll(productList);

        return true;

    }


}
