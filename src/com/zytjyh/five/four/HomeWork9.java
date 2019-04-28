package com.zytjyh.five.four;

class A{
    A(){
        this(1);
        System.out.println("nmsl");
    }
    A(int i){
        System.out.println(i);
    }
}
public class HomeWork9 {
    public static void main(String[] args){
        new A();
    }

}
