package com.zytjyh.eleven.two;

import java.util.ArrayList;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Ja11_2_3 {
    private ArrayList<Object> items=new ArrayList<Object>();
    //private int next = 0;
    //public Ja11_2_3(int size) { items = new Object[size]; }
    public void add(Object x) {
        //if(next < items.length)
        items.add(x);
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.size(); }
        public Object current() { return items.get(i); }
        public void next() { if(i < items.size()) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Ja11_2_3 sequence = new Ja11_2_3(/*10*/);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~

