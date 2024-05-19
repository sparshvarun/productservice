package com.ecommerce.productservice.repository;

import com.ecommerce.productservice.models.GenericProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericProductRepository extends JpaRepository<GenericProduct,Long> {

}
