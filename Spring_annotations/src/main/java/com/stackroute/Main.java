package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.ConfigClass;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        Object ob;
        // System.out.println("Hello");
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
        context.getBean("DJ", Movie.class).show();
        context.getBean("Prabhas",Actor.class).act();
        context.getBean("beanLifecycleDemo");


        if(context.getBean("Prabhas",Actor.class)==context.getBean("Allu",Actor.class))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("not equal");
        }
//        context.getBean("beanLifeCycle");
        context.registerShutdownHook();





    }
}