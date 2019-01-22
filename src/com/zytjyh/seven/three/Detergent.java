package com.zytjyh.seven.three;


import static net.mindview.util.Print.*;
class Cleanser{
    private String s="Cleanser";
    public void append(String a){s+=a;}
    public void dilute(){
        append("dilute()");
    }
    public void apply(){
        append("apply()");
    }
    public void scrub(){
        append("scrub()");
    }
    public String toString(){
        return s;
    }
    public static void main(String[] args){
        Cleanser x=new Cleanser();
        x.dilute();x.apply();x.scrub();
        print(x);
    }

}
public class Detergent{
    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        cleanser.scrub();
    }

    public void foam(){
        append("foam()");
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }

    private Cleanser cleanser=new Cleanser();
    public static void main(String[] args){
        Detergent x=new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);
    }

}
