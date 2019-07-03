package com.oaec.teachingsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oaec.teachingsystem.mapper")
public class TeachingsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachingsystemApplication.class, args);
    }

}
