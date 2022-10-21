package com.example.demo.auth;



import java.util.Optional;

public interface ApplicationUserDeo {


    Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
