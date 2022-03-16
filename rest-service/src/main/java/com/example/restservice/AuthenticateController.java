package com.example.restservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.expression.BeanFactoryResolver;
//import org.springframework.context.weaving.;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class AuthenticateController {

    @PostMapping("/get-weather")
    public User login(@RequestParam("user") String username, @RequestParam("password") String password) {
        String token = getJWTToken(username);
        User user = new User();
        user.setUser(username);
        user.setToken(token);
        return user;
    }

    @Bean
    BearerTokenResolver bearerTokenResolver() {
        DefaultBearerTokenResolver bearerTokenResolver = new DefaultBearerTokenResolver();
        bearerTokenResolver.setBearerTokenHeaderName(HttpHeaders.PROXY_AUTHORIZATION);
        return bearerTokenResolver;
    }
}
