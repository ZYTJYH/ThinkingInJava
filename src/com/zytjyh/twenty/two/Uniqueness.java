package com.zytjyh.twenty.two;

public @interface Uniqueness {
    Constraints constraints()default @Constraints(unique = true);
}
