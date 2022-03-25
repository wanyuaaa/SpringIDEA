package com.myspring.springbootproject.controller;

import com.myspring.springbootautoconfigure.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanyu
 * @createTime 2022-03-25 9:58
 */
@RestController
public class HelloController {

    @Autowired
    MyService myService;

    @GetMapping("/hello")
    public String sayHello(){
        String s = myService.sayHello("万宇");
        return s;
    }
}
