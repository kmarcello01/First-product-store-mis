package com.spring_boot_product_store.product_store_mis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.spring_boot_product_store.product_store_mis.models.AppUser;
import com.spring_boot_product_store.product_store_mis.repositories.AppUserRepository;

@Service
public class AppUserService implements UserDetailsService{
    @Autowired
    private AppUserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        AppUser appUser = repo.findByEmail(email);

        if (appUser != null) {
            var springUser = User.withUsername(appUser.getEmail())
                        .password(appUser.getPassword())
                        .roles(appUser.getRole())
                        .build();

            return springUser;
        }
        return null;
    }

}
