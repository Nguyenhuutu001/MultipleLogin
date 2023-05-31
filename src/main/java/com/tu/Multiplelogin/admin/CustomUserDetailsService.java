package com.tu.Multiplelogin.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.tu.Multiplelogin.customer.Customer;
import com.tu.Multiplelogin.customer.CustomerRepository;
 
public class CustomUserDetailsService implements UserDetailsService {
 
    @Autowired private UserRepository repo;
     
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = repo.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("No customer found with the given email.");
        }
         
        return new CustomUserDetails(user);
    }
 
}
