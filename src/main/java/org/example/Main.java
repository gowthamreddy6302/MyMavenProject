package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // SPRING CONTAINER
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config.xml");
        Customer cus = (Customer) context.getBean("customer");
        System.out.println("CUSTOMER NAME :  " + cus.getName());
        System.out.println("CUSTOMER CONTACT :  " + cus.getContact());
        System.out.println("CUSTOMER ADDRESS :  " + cus.getAddress());
    }
}