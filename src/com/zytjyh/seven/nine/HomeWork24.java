package com.zytjyh.seven.nine;

public class HomeWork24 {
    public static void main(String[] args) {
        new JapaneseBeetle();
    }
}
class JapaneseBeetle extends Beetle{
    int m = printInit("JapaneseBeetle.m.initilized");
    public JapaneseBeetle() {
        System.out.println("m = "+m);
        System.out.println("j = "+j);
    }
    static int x3 = printInit("static JapansesBeetle.x3 initlized");
}
