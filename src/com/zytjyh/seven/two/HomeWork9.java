package com.zytjyh.seven.two;


class Component1{
    Component1(){
        System.out.println("Component1");
    }
    
}
class Component2{
    Component2(){
        System.out.println("Component2");
    }
}
class Component3{
    Component3(){
        System.out.println("Component3");
    }
    
}
class Root{
    private Component1 component1=new Component1();
    private Component2 component2=new Component2();
    private Component3 component3=new Component3();

    Root(){
        System.out.println("Root");
    }
}

class Stem extends Root{
    private Component1 component1=new Component1();
    private Component2 component2=new Component2();
    private Component3 component3=new Component3();
    Stem(){
        System.out.println("Stem");
    }
}
public class HomeWork9 {
    public static void main(String[] args){
        Stem stem=new Stem();
    }
    
}
