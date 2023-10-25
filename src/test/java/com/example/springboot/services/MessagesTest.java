package com.example.springboot.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.springboot.services.Messages;

import static org.junit.jupiter.api.Assertions.*;

class MessagesTest {

    @Test
    void testMessage() {
        Messages obj = new Messages();
        Assertions.assertEquals("Hello World!", obj.getMessage("World"));
    }

    @Test
    void testNameBlank() {
        Messages obj = new Messages();
        Assertions.assertEquals("Please Provide a name!", obj.getMessage(""));
    }

    @Test
    void testNameNull() {
        Messages obj = new Messages();
        Assertions.assertEquals("Please Provide a name!", obj.getMessage(null));
    }
    
    @Test
    void testMessage2() {
    	Messages obj = new Messages();
        Assertions.assertEquals("ABC", obj.getMessage2());
    }

}