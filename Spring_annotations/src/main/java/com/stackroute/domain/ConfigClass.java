package com.stackroute.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:/values.properties")
public class ConfigClass {
    @Bean(name = {"Nani","Prabhas"})
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Actor Allu()//Allu is the name of ID or object
    {
        Actor actor=new Actor();
        return actor;

    }
    @Bean(name={"jersey","eega"})
    public Movie movieBean()//bean name is movieBean
    {
        Movie movie=new Movie();
        //movie.setActor(Allu());
        return movie;

    }
}