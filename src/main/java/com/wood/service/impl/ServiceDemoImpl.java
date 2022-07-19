package com.wood.service.impl;

import com.wood.mapper.MapperDemo;
import com.wood.service.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ServiceDemoImpl implements ServiceDemo {

    @Autowired
    private MapperDemo mapperDemo;


    @Override
    public List<Map> demo() {
        return mapperDemo.demo();
    }
}
