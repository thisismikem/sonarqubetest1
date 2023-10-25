package com.example.springboot.controller;

import com.example.springboot.controller.WelcomeController;
import com.example.springboot.services.WelcomeService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

class WelcomeControllerTest {
    @Test
    void shouldWelcome() {
        WelcomeService welcomeService = Mockito.mock(WelcomeService.class);
        when(welcomeService
                .getWelcomeMessage("Michael"))
                .thenReturn("Welcome Michael!");
        WelcomeController welcomeController = new WelcomeController(welcomeService);
        Assertions.assertEquals("Welcome Michael!", welcomeController.welcome("Michael"));
    }
}