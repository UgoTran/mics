package com.hivetech.xml.application;

import com.hivetech.xml.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("classpath:application.xml");

        ClientA clientA = appContext.getBean(ClientA.class);
        ClientB clientB = appContext.getBean("beanClientB", ClientB.class);
        ClientC clientC = appContext.getBean(ClientC.class);
        ClientD clientD = appContext.getBean(ClientD.class);
//
//        for(String name: appContext.getBeanDefinitionNames())
//            System.out.println(name);

        clientC.printResult();
        clientD.showD(new ClientD());

    }
}
