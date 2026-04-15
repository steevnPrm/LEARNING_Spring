package com.github.steevnPrm.MasterRepo.controller;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/public")
    public String publicRoute() {
        return "Public OK";
    }

    @GetMapping("/secure")
    public String secureRoute() {
        return "Secure OK";
    }

    @GetMapping("/profile")
    public Map<String, Object> profile(@AuthenticationPrincipal Jwt jwt) {
        return Map.of(
            "sub", jwt.getSubject(),
            "email", jwt.getClaimAsString("email")
        );
    }
}