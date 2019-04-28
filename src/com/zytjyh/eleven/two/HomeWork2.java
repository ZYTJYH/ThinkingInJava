package com.zytjyh.eleven.two;

import java.util.HashSet;
import java.util.Set;

public class HomeWork2 {
    public static void main(String[] args){
        Set<Integer> c=new HashSet<Integer>();
        for(int i=0;i<10;i++){
            c.add(i);
        }
        for(Integer i:c){
            System.out.print(i+",");
        }
    }
}
