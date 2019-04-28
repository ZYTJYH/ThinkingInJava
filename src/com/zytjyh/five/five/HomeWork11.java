package com.zytjyh.five.five;

class B{
    @Override
    protected void finalize() {
        System.out.println("finalize");
    }
}
public class HomeWork11 {
    public static void main(String[] args){
        new B();
        System.gc();
        System.runFinalization();
    }
}
