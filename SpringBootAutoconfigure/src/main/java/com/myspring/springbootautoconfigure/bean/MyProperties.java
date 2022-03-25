package com.myspring.springbootautoconfigure.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wanyu
 * @createTime 2022-03-25 9:26
 */
@ConfigurationProperties("myspring.auto")//指定配置文件中的识别头
public class MyProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
