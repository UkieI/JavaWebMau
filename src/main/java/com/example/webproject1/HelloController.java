package com.example.webproject1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CREATED 23/11/2023 - 2:11 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@RestController
public class HelloController {
    @RequestMapping
    public String index(){
        return "Hello Spring Boot";
    }
}
