package com.springapi.springapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
@CrossOrigin(origins = "*")
public class TestController {



    @RequestMapping(value = "/getRecord", method = RequestMethod.GET)
    public String displayString(){
        return "Iloveyou love sleep well muah";
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public String displayMessage() throws Throwable{
        return "ito palang ang naka lagay sa service ko wala pang design haha";
    }

    @RequestMapping(value = "/getResult", method = RequestMethod.GET)
    public String displayCondition(@Param("department_code") String department_code){
        String result = "";
        if(department_code.equals("1")){
            result = "you input : " + department_code;
        } else if (department_code.equals("2")) {
            result = "haha number: " + department_code;
        }else {
            result = "nice try";
        }

        return result;
    }
}
