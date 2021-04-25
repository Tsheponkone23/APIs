package com.example.api.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class ApiController {


@PostMapping(path ="/add")
    public String getApi(@RequestBody String name){
    return "API name is" + name;
}
}
