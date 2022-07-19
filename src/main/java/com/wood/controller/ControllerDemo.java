package com.wood.controller;

import com.wood.service.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/controller")
public class ControllerDemo {

    @Autowired
    private ServiceDemo serviceDemo;

    @GetMapping("/hello")
    public List<Map> hello(){
        return serviceDemo.demo();
    }

}
