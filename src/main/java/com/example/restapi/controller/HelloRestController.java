package com.example.restapi.controller;

import com.example.restapi.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/","/hello"})

public class HelloRestController {
        @GetMapping("/hello")
        public String sayHello() {
            return "Hello From BridgeLabz!!!";
        }
        @GetMapping("/query")
        public String getName(@RequestParam(value = "name",defaultValue = "Shiwani") String name) {
            return "Hello " + name + "!";
        }
        @GetMapping("/findName/{name}")
        public String find(@PathVariable String name){
            return  " Hello " + name + "!!";
        }
       @PostMapping("/post")
       public String insert(@RequestBody User user){
           return  " Hello " + user.getFirstName() + " " + user.getLastName() ;
    }

    }
