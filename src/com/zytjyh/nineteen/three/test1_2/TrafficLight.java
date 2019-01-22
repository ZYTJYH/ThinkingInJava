package com.zytjyh.nineteen.three.test1_2;



import static com.zytjyh.nineteen.three.test1_2.Signal.*;
import static net.mindview.util.Print.print;

public class TrafficLight {
    Signal color=RED;
    public void change(){
        switch (color){
            case RED:color=GREEN;break;
            case GREEN:color=YELLOW;break;
            case YELLOW:color=RED;break;
        }
    }
    @Override
    public String toString(){
        return "The traffic light is "+color;
    }

    public static void main(String[] args){
        com.zytjyh.nineteen.three.TrafficLight t=new com.zytjyh.nineteen.three.TrafficLight();
        for(int i=0;i<7;i++){
            print(t);
            t.change();
        }
    }
}
