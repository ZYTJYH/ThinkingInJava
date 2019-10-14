package com.zytjyh.fiveteen.two;

import java.util.ArrayList;

class D{

}
public class HomeWork2<T> {
    private ArrayList<T> a=new ArrayList<T>(3);
    private int cnt;
    public T get(int cnt){return a.get(cnt);}
    public void set(int cnt,T o){a.add(cnt,o);}
    public static void main(String[] args){
        HomeWork2<D> d=new HomeWork2<>();
        d.set(0,new D());
        d.set(1,new D());
        d.set(2,new D());
    }

}
