package com.zytjyh.seven.two;

class A{
    A(){
        System.out.println("A");
    }
}
class B{
    B(){
        System.out.println("B");
    }
}
class C extends A{
    private B b=new B();
}
public class HomeWork5 {
    public static void main(String[] args){
        C c=new C();
    }
    
}
