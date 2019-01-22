package com.zytjyh.seven.Five;


class Engine1{
    public void start(){
    }
    public void rev(){
    }
    public void stop(){
    }
    public void service(){
        System.out.println("ss");
    }
}

class Wheel1{
    public void inflate(int psi){}
}

class Window1{
    public void rollup(){}
    public void rollupdown(){}
}

class Door1{
    public Window1 window=new Window1();
    public void open(){}
    public void close(){}
}
class Car1 {
    public Engine1 engine=new Engine1();
    public Wheel1[] wheel=new Wheel1[4];
    public Door
            left=new Door(),
            right=new Door();
    public Car1(){
        for(int i=0;i<4;i++){
            wheel[i]=new Wheel1();
        }
    }
}

public class HomeWork14 {
    public static void main(String[] args){
        Car1 car=new Car1();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.engine.service();
    }
}
