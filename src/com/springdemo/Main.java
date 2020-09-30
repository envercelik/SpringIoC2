package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Enver Çelik");

        /*without IoC
        CustomerManager customerManager = new CustomerManager(new MysqlDal());
        customerManager.add(customer);
        */

        AnnotationConfigApplicationContext  context =  new AnnotationConfigApplicationContext(IocConfig.class);



        //with IoC
        ICustomerService customerService = context.getBean("service",ICustomerService.class);
        customerService.add(customer);




    }
}
