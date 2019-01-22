package com.zytjyh.seven.two;

class Aa{
    Aa(int temp){
        System.out.println("A");
    }
}
class Bb{
    Bb(int temp){
        System.out.println("B");
    }
}
class Cc extends Aa{
    private Bb b=new Bb(11);
    Cc(int temp){
        super(temp);
        System.out.println("B");
    }
}
public class HomeWork7 {
    public static void main(String[] args){
        Cc cc=new Cc(12);
    }

}
