package com.todolistapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/character")
    public String getCharacter() {
        return "Your character";
    }

    @PutMapping("/character")
    public String updateCharacter() {
        return "Your character updated";
    }
}
