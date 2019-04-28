package com.zytjyh.eleven.four;

import java.util.*;
import static net.mindview.util.Print.*;
class Produce{
    private int key=0;
    private String st=null;
    String next(){
        switch(key){
            case 0:key++;st="Snow";break;
            case 1:key++;st="Game";break;
            case 2:key++;st="Love";break;
            case 3:key++;st="Worlun";break;
            case 4:key=0;st="Die";break;
        }
        return st;
    }
}
public class HomeWork4{
    public static void main(String[] args){
        String[] st=new String[7];
        ArrayList<String> al=new ArrayList<String>();
        LinkedList<String> ll=new LinkedList<String>();
        HashSet<String> hs=new HashSet<String>();
        LinkedHashSet<String> ls=new LinkedHashSet<String>();
        TreeSet<String> ts=new TreeSet<String>();
        String temp=null;
        Produce pd=new Produce();
        for(int i=0;i<7;i++){
            temp=pd.next();
            st[i]=temp;
            al.add(temp);ll.add(temp);hs.add(temp);ls.add(temp);
            ts.add(temp);
        }
        for(String s:st){printnb(s+" ");}
        print(al);
        print(ll);
        print(hs);
        print(ls);
        print(ts);
    }
}

