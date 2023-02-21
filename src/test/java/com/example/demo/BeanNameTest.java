package com.example.demo;

import com.example.demo.data.Foo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(BeanNameTest.class);
    }

    @Test
    void testBeanName() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo firstFoo = applicationContext.getBean("firstBean", Foo.class);
        Foo secondFoo = applicationContext.getBean("secondBean", Foo.class);

        Assertions.assertSame(foo, firstFoo);
        Assertions.assertNotSame(foo, secondFoo);
        Assertions.assertNotSame(firstFoo, secondFoo);
    }
}
