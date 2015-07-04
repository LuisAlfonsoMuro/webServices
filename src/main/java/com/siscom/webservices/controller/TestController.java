package com.siscom.webservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestController {
    
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "Hola Spring Rock!";
    }
    
}
