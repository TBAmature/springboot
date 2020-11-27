package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {
   /* @Autowired
    private DataSourceProperties dataSourceProperties;*/
    @Autowired
    private DataSource dataSource ;

    @RequestMapping("/hello")
    public String sayHello(){
        //System.out.println(dataSourceProperties);

        System.out.println(dataSource.getClass());

        return "hello spring boot!!" ;
    }

}

