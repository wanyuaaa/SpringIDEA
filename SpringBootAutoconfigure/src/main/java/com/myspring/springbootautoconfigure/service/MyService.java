package com.myspring.springbootautoconfigure.service;

import com.myspring.springbootautoconfigure.bean.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wanyu
 * @createTime 2022-03-25 9:19
 */
//默认不放入容器中
public class MyService {

    @Autowired
    MyProperties myProperties;

    public String sayHello(String name) {

        String str = myProperties.getPrefix() + ":" + name + "->" + myProperties.getSuffix();

        return str;
    }
}
