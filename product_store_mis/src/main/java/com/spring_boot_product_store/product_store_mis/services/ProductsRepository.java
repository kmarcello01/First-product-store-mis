package com.spring_boot_product_store.product_store_mis.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot_product_store.product_store_mis.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
