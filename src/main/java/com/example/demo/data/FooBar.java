package com.example.demo.data;

import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public class FooBar {
    private Foo foo;

    private Bar bar;
}
