package com.stackroute.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:/values.properties")
public class ConfigClass {
    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean()
    {
        return new BeanPostProcessorDemoBean();
    }

    @Bean
    public BeanLifeCycleDemo beanLifecycleDemo(){
        return new BeanLifeCycleDemo();
    }
    @Bean(name = {"Allu","Prabhas"})
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Actor Allu()//Allu is the name of ID or object
    {
        return new Actor();
//        return actor;

    }
    @Bean(name={"DJ","Arya"})
    public Movie movieBean()//bean name is movieBean
    {
        Movie movie=new Movie();
        //movie.setActor(Allu());
        return movie;

    }
}