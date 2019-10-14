package com.zytjyh.fiveteen.two;

import java.util.ArrayList;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class HomeWork4<T>{
    private ArrayList<T> items;
    private int next = 0;
    private int size;
    public HomeWork4(int size) {
        // TODO Auto-generated constructor stub
        items = new ArrayList<T>(size);
        this.size=size;
    }

    public void add(T x) {
        if (next < size) {
            items.add(next++,x);
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            // TODO Auto-generated method stub
            return i == items.size();
        }

        @Override
        public Object current() {
            // TODO Auto-generated method stub
            return items.get(i);
        }

        @Override
        public void next() {
            // TODO Auto-generated method stub
            if (i < items.size()) {
                i++;
            }
        }

    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        HomeWork4 sequence = new HomeWork4(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }

}
