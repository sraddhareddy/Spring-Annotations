package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.ConfigClass;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        Object ob;
        // System.out.println("Hello");
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
        context.getBean("oh baby", Movie.class).act();






    }
}