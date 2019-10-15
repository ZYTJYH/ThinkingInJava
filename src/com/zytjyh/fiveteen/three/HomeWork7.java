package com.zytjyh.fiveteen.three;

import java.util.Iterator;

public class HomeWork7 {
    private int n;
    private Fibonacci fibonacci=new Fibonacci();
    public HomeWork7(int count){n=count;}
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>(){
            public boolean hasNext(){return n>0;}
            public Integer next(){
                n--;
                return HomeWork7.this.fibonacci.next();
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args){
        for(int i: new IterableFibonacci(18))
            System.out.print(i+" ");
    }
}
