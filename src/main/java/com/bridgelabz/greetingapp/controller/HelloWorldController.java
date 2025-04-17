package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.UserInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "Hello from Ayush";
    }

    @RequestMapping( value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody UserInfo user){
        return "Hello " + user.getFirstName() +  " " + user.getLastName() + "!";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,@RequestParam(value = "lastName") String lastName){
        return "Hello " + firstName + " " + lastName + "!";
    }



}
