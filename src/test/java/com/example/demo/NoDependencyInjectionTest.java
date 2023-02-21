package com.example.demo;

import com.example.demo.data.Bar;
import com.example.demo.data.Foo;
import com.example.demo.data.FooBar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class NoDependencyInjectionTest {
    @Test
    void testNoDependencyInjection() {
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
