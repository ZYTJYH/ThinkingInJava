package com.zytjyh.seven.seven;
class Amphibian{
    public void moveInWater() {
        System.out.println("moveInWater");
    }
    public void moveInLand() {
        System.out.println("moveInLand");
    }
}
class Frog extends Amphibian{

}

public class HomeWork16 {
    public static void main(String[] args){
        Frog f=new Frog();
        f.moveInLand();
        f.moveInWater();
    }

}
