package com.xuran.spring.practice.schemas;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author: xuran5
 * @createdate: 2017-09-27 18:32
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
    }
}
