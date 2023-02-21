package com.example.demo;

import com.example.demo.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanNameConfiguration {

    @Primary
    @Bean(name = "firstBean")
    public Foo foo1() {
        return new Foo();
    }

    @Bean(name = "secondBean")
    public Foo foo2() {
        return new Foo();
    }

}
