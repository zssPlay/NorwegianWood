package com.wood;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(value = "com.wood.mapper")
public class SpringbootApplication {
    public static void main(String[] args) {
           //SpringbootApplication.run(SpringbootApplication.class,args);
        SpringApplication.run(SpringbootApplication.class,args);
    }
}
