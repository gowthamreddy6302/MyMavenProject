package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        // SPRING CONTAINER
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:configmetadata.xml");
        NewCustomer cus = (NewCustomer) context.getBean("customer");
        System.out.println("CUSTOMER NAME :  " + cus.getName());
        System.out.println("CUSTOMER CONTACT :  " + cus.getContact());
        System.out.println("CUSTOMER ADDRESS :  " + cus.getAddress());
        System.out.println("CUSTOMER ADDRESS-1 : " + cus.getAddress1());
        System.out.println("CUSTOMER ADDRESS-2 : " + cus.getAddress2());
        System.out.println("-------*CUSTOMER PRODUCT DETAILS*---------");
        NewOrder order = (NewOrder) context.getBean("ord");
        System.out.println("PRODUCT-ID : " + order.getProductId());
        System.out.println("PRODUCT-NAME : " + order.getProductName());
        System.out.println("CUSTOMER-NAME : " + order.getCustomer().getName());
        System.out.println("CUSTOMER-CONTACT : " + order.getCustomer().getContact());
        System.out.println("CUSTOMER-ADDRESS : " + order.getCustomer().getAddress2());
    }
}
