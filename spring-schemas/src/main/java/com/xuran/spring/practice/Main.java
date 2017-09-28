package com.xuran.spring.practice;


import com.xuran.spring.practice.schemas.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


/**
 * @description:
 * @author: xuran5
 * @requireNo:
 * @createdate: 2017-09-27 18:20
 * @lastdate:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        test1();
    }

    public static void test() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:applicationContext.xml" });
        context.start();
        System.out.println("服务启动成功!");
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }

    public static void test1() throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        People p = (People)ctx.getBean("cutesource");
        System.out.println("服务启动成功!");
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
