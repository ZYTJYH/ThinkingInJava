package com.zytjyh.five.four;

public class HomeWork8 {
    public void test1(){
        System.out.println("test1");
    }
    public void test2(){
        test1();
        this.test1();
    }
    public static void main(String[] args){
        new HomeWork8().test2();
    }
    
}
