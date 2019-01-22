package com.zytjyh.seven.four;



class Component1{
    Component1(){
        System.out.println("Component1");
    }
    public void dispose(){
        System.out.println("dispose Component1");
    }
}
class Component2{
    Component2(){
        System.out.println("Component2");
    }
    public void dispose(){
        System.out.println("dispose Component2");
    }
}
class Component3{
    Component3(){
        System.out.println("Component3");
    }
    public void dispose(){
        System.out.println("dispose Component3");
    }
}
class Root{
    private Component1 component1=new Component1();
    private Component2 component2=new Component2();
    private Component3 component3=new Component3();

    Root(){
        System.out.println("Root");
    }
    public void dispose(){
        System.out.println("dispose Root");
        component3.dispose();
        component2.dispose();
        component1.dispose();
    }
}

class Stem extends Root{
    private Component1 component1=new Component1();
    private Component2 component2=new Component2();
    private Component3 component3=new Component3();
    Stem(){
        System.out.println("Stem");
    }
    public void dispose(){
        System.out.println("dispose Stem");
        component3.dispose();
        component2.dispose();
        component1.dispose();
        super.dispose();
    }
}
public class HomeWork12 {
    public static void main(String[] args){
        Stem stem=new Stem();

    }

}
