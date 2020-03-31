package com.kodilla.kodillapatterns2.kodillapatterns2_M_2001_facade;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Authenticator {
    public boolean isAuthenticated(Long userId){
        Random random = new Random();
        return random.nextBoolean();
    }
}