package com.zytjyh.seven.nine;

public class HomeWork23 {
    public static void main(String[] args) {
        System.out.println("Calling static member");
        LoadTest.staticMember();
        System.out.println("Creating an object");
        new LoadTest();
    }
}
class LoadTest{
    static{
        System.out.println("Loading loadTest");
    }
    static void staticMember() {};
}
