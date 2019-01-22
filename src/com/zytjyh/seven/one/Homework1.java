package com.zytjyh.seven.one;

class Test{
    @Override
    public String toString() {
        return "ss";
    }
}
public class Homework1{
    private Test test;
    {
        test=new Test();
    }

    @Override
    public String toString() {
        return test.toString();
    }

    public static void main(String[] args){
        Homework1 homework=new Homework1();
        System.out.println(homework);
    }
}
