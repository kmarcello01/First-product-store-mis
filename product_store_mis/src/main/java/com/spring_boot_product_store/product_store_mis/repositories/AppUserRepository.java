package com.spring_boot_product_store.product_store_mis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot_product_store.product_store_mis.models.AppUser;


public interface AppUserRepository extends JpaRepository<AppUser, Integer>{

    public AppUser findByEmail(String email);
}
