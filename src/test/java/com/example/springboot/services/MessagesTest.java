package com.example.springboot.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.springboot.services.Messages;

import static org.junit.jupiter.api.Assertions.*;

class MessagesTest {

    @Test
    public void testMessage() {
        Messages obj = new Messages();
        Assertions.assertEquals("Hello World!", obj.getMessage("World"));
    }

    @Test
    public void testNameBlank() {
        Messages obj = new Messages();
        Assertions.assertEquals("Please Provide a name!", obj.getMessage(""));
    }

    @Test
    public void testNameNull() {
        Messages obj = new Messages();
        Assertions.assertEquals("Please Provide a name!", obj.getMessage(null));
    }
    
    @Test
    void testMessage2() {
    	Messages obj = new Messages();
        Assertions.assertEquals("ABC", obj.getMessage2());
    }

}