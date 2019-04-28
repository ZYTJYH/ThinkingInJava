package com.zytjyh.five.seven;

class Test{
    static int a=1;
    static int b;
    static {
        b=2;
    }
    static void print(){
       System.out.println(a+" "+ b);
    }
}
public class HomeWork14 {
    public static void main(String[] args){
        Test.print();
    }
}
