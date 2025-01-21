package com.springapi.springapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@CrossOrigin(origins = "*")
public class TestController {



    @RequestMapping(value = "/getRecord", method = RequestMethod.GET)
    public String displayString(){
        return "Iloveyou love sleep well muah";
    }
}
