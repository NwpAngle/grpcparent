package com.example.grpcservice.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class TestController {


    @RequestMapping("/printUrl")
    public String printUrl(HttpServletRequest request){
        return "url is"+request.getRequestURL();
    }
}
