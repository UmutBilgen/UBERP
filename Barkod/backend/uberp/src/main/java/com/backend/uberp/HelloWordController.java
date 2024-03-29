package com.backend.uberp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloWordController {
    
    @GetMapping("/hello")
    public String helloWorld(@RequestParam (value = "name",defaultValue = "World" ) String name) {
        return String.format("Hello %s!", name);
    }
    

}
