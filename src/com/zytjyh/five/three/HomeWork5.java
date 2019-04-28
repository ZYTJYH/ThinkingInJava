package com.zytjyh.five.three;

class Dog{
    void bark(){
        System.out.println("狗吠");
    }
    void bark(int i){
        System.out.println("咆哮");
    }
}
public class HomeWork5 {
    public static void main(String[] args){
        Dog d=new Dog();
        d.bark();
        d.bark(1);
    }
}
