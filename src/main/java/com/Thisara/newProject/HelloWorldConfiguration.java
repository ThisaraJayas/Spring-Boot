package com.Thisara.newProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record introduced in jdk 16 it automatically include constructors getters and setters
record Person(String name, int age) {};
record Address(String firstlane, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Thisara";
    }

    @Bean
    public int age(){
        return 21;
    }

    @Bean
    public Person person(){
        var person = new Person("Thisara",21);
//        person.age(); it includes all get set methods (record)
//        person.name();
        return person;
    }

    @Bean
    public Address address(){
        var address = new Address("303 new kandy road","Colombo");
        return address;
    }
}
