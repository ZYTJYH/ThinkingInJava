package com.zytjyh.twenty.two;

public @interface Constraints {
    boolean primaryKey() default false;
    boolean allowNull()default true;
    boolean unique()default false;
}


