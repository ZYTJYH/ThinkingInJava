package com.zytjyh.seven.seven;

class Frog1 extends Amphibian{
    @Override
    public void moveInWater() {
        System.out.println("moveInWater~~~");
    }
}
public class HomeWork17 {
    public static void main(String[] args){
        Frog1 f=new Frog1();
        f.moveInLand();
        f.moveInWater();
    }
}
