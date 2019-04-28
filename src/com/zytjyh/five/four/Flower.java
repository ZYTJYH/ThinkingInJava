package com.zytjyh.five.four;

import static net.mindview.util.Print.print;

public class Flower {
    int petalCount=0;
    String s="initial value";
    Flower(int petals){
        petalCount=petals;
        print("Constructor w/ int arg only,petalCount= "+petalCount);
    }
    Flower(String ss){
        print("Constructor w/ int arg only,s = "+ss);
        s=ss;
    }
    Flower(String s,int petals){
        this(petals);
//        this(s);
        this.s=s;
        print("String & int args");
    }
    Flower(){

    }
    void printPetalCount(){
        print("petalCount = "+petalCount+" s = "+s);
    }

    public static void main(String[] args){
        Flower x=new Flower();
        x.printPetalCount();
    }

}
