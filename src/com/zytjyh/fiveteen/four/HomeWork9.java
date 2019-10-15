package com.zytjyh.fiveteen.four;

public class HomeWork9 {
    public <A,B,C> void f(A a,B b,C c){
        System.out.println(a.getClass().getSimpleName()+" "+b.getClass().getSimpleName()+" "+c.getClass().getSimpleName());
    }
    public static void main(String[] args){
        HomeWork9 test=new HomeWork9();
        test.f(1,2.0,"s");
    }

}
