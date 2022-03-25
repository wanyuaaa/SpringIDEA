package com.myspring.springbootautoconfigure.auto;

import com.myspring.springbootautoconfigure.bean.MyProperties;
import com.myspring.springbootautoconfigure.service.MyService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wanyu
 * @createTime 2022-03-25 9:35
 */
@Configuration
@ConditionalOnMissingBean(MyService.class)
@EnableConfigurationProperties(MyProperties.class)
public class MyServiceAutoConfiguration {

    @Bean
    public MyService myService(){
        MyService myService = new MyService();
        return myService;
    }
}
