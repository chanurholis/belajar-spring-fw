package com.example.demo;

import com.example.demo.data.Foo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateBeanTest {
    @Test
    void testDuplicateError() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBean.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });
    }

    @Test
    void testDuplicateBeanSame() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBean.class);

        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }
}
