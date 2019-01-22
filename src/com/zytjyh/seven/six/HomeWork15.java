package com.zytjyh.seven.six;

import com.zytjyh.seven.six.test.A;

public class HomeWork15 {
    public static void main(String[] args){
        A a=new A();
//        a.testA();
    }
}
class B extends A{
    public static void main(String[] args){
        new B().testA();
    }
}
