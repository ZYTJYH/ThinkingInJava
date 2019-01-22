package com.zytjyh.seven.two;

public class HomeWork2 extends Detergent {
    @Override
    public void scrub() {
        append("HomeWork2");
        super.scrub();
    }

    public void sterilize(){
        append("sterilize()");
    }

    public static void main(String[] args){
        HomeWork2 homeWork2=new HomeWork2();
        homeWork2.dilute();
        homeWork2.apply();
        homeWork2.scrub();
        homeWork2.foam();
        homeWork2.sterilize();
        System.out.println(homeWork2);
    }
}
