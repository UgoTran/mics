package com.th3h.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(" xml-configuration.xml");

        ClientB clientB = context.getBean(ClientB.class);
        clientB.showInB();

        for(String beanName : context.getBeanDefinitionNames())
            System.out.println(beanName);
    }

}
