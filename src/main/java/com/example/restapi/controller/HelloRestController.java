package com.example.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class HelloRestController {
        @GetMapping("/hello")
        public String sayHello() {
            return "Hello From BridgeLabz!!!";
        }
        @GetMapping("/query")
        public String getName(@RequestParam(value = "name",defaultValue = "Shiwani") String name) {
            return "Hello " + name + "!";
        }
}
