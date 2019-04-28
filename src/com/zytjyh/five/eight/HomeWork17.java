package com.zytjyh.five.eight;


class Persan{
    Persan(String name){
        System.out.println("姓名是："+name);
    }
}
public class HomeWork17 {

    public static void main(String[] args) {
        Persan[] p = new Persan[]{};
//		并不会打印初始化的消息，因为压根没有创建对象，不会调用构造器
    }
}
