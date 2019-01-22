package com.zytjyh.seven.eight;


class Amphibian{
    public Amphibian(String s){
        System.out.println(s);
    }
}
public class HomeWork19 {
    private final Amphibian ahn;
    public HomeWork19(){
        ahn = new Amphibian("initialize");
    }
    public HomeWork19(String s){
        ahn = new Amphibian(s);
    }
    public static void main(String[] args){
        new HomeWork19();
        new HomeWork19("initialize");
    }
}


