package com.zytjyh.five.five;

class A{
    @Override
    protected void finalize() {
        System.out.println("finalize");
    }
}
public class HomeWork10 {
    public static void main(String[] args){
        new A();
        System.gc();
    }
    
}
