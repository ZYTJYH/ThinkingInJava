package com.zytjyh.seven.two;


class Component11{
    Component11(int i){
        System.out.println("Component11");
    }

}
class Component22{
    Component22(int i){
        System.out.println("Component22");
    }
}
class Component33{
    Component33(int i){
        System.out.println("Component33");
    }

}
class Root1{
    private Component11 component1=new Component11(1);
    private Component22 component2=new Component22(2);
    private Component33 component3=new Component33(3);

    Root1(int i){
        System.out.println("Root1");
    }
}

class Stem1 extends Root1{
    private Component11 component1=new Component11(1);
    private Component22 component2=new Component22(2);
    private Component33 component3=new Component33(3);
    Stem1(int i){
        super(i);
        System.out.println("Stem1");
    }
}
public class HomeWork10{
    public static void main(String[] args){
        Stem1 stem=new Stem1(1);
    }

}
