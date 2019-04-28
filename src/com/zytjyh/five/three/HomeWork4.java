package com.zytjyh.five.three;


public class HomeWork4 {
    HomeWork4(){
        System.out.println("无参构造器");
    }
    HomeWork4(String test){
        System.out.println("构造器"+test);
    }
    public static void main(String[] args){
        new HomeWork4("nmsl");
    }
}
