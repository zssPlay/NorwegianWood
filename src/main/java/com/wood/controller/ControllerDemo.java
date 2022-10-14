package com.wood.controller;

import com.wood.common.ResponseResult;
import com.wood.po.UserProfile;
import com.wood.service.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
//@RequestMapping("/controller")
public class ControllerDemo {

    @Autowired
    private ServiceDemo serviceDemo;

    @GetMapping("/hello")
    public List<UserProfile> hello(){
        List<UserProfile> list = serviceDemo.demo();
        //Stream<UserProfile> userProfileStream = list.stream().filter(s -> s.getAge() != null && s.getAge() == 21);
        Stream<UserProfile> userProfileStream = list.stream().filter(s -> s.getGpa().equals(new BigDecimal("4.00000000")));
        //Stream<UserProfile> userProfileStream = list.stream().limit(2);
        List<UserProfile> collect = userProfileStream.collect(Collectors.toList());
        return collect;
    }

}
