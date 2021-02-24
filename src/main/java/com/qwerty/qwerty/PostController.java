package com.qwerty.qwerty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello World";
    }
}
