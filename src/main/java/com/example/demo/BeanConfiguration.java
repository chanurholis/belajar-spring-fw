package com.example.demo;

import com.example.demo.data.Foo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

@Slf4j
public class BeanConfiguration {
    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Create new bean");
        return foo;
    }
}
