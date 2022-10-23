package com.example.demo.jwt;


import io.jsonwebtoken.security.Keys;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;

import javax.crypto.SecretKey;


@ConfigurationProperties(prefix = "application.jwt")
public class JwtConfig {


    private String secretKey;
    private String tokenPrefix;
    private Integer tokenExpierationAfterDays;


    public JwtConfig() {
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getTokenPrefix() {
        return tokenPrefix;
    }

    public void setTokenPrefix(String tokenPrefix) {
        this.tokenPrefix = tokenPrefix;
    }

    public Integer getTokenExpierationAfterDays() {
        return tokenExpierationAfterDays;
    }

    public void setTokenExpierationAfterDays(Integer tokenExpierationAfterDays) {
        this.tokenExpierationAfterDays = tokenExpierationAfterDays;
    }



    public String getAuthorizationHeader (){

        return HttpHeaders.AUTHORIZATION;
    }

}
