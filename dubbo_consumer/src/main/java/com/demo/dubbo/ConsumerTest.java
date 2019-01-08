package com.demo.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"classpath:springmvc.xml"});

        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.sayHello("dubbp成功"));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
