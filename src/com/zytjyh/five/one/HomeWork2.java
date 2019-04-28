package com.zytjyh.five.one;

public class HomeWork2 {
    private String test1="1";
    private String test2;

    public String getTest1() {
        return test1;
    }

    public String getTest2() {
        return test2;
    }

    HomeWork2(){
        test2="2";
    }
    public static void main(String[] args){
        HomeWork2 h=new HomeWork2();
        System.out.println(h.getTest1()+h.getTest2());
    }

}
