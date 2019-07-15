package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    public Actor Allu()
    {
        Actor actor=new Actor();
        actor.setAge(34);
        actor.setGender("male");
        actor.setName("Mahesh");
        return actor;

    }
    @Bean(name={"BAN","Maharshi"})
    public Movie movieBean()//bean name is movieBean
    {
        Movie movie=new Movie(Allu());
        return movie;

    }
}