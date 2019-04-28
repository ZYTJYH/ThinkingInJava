package com.zytjyh.eleven.one;


import java.util.ArrayList;

import static net.mindview.util.Print.print;

class Gerbil{
    private static int counter=0;
    private final int gerbilNumber=counter++;
    int hop(){return gerbilNumber;}
}

public class HomeWork1 {
    public static void main(String[] args){
        ArrayList<Gerbil> ger=new ArrayList<Gerbil>();
        for(int i=0;i<3;i++)ger.add(new Gerbil());
        for(Gerbil g:ger){
            print(g.hop());
        }
        for(int i=0;i<ger.size();i++)
            print(ger.get(i).hop());
    }
}
