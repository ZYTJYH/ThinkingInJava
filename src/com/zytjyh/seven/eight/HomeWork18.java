package com.zytjyh.seven.eight;

import static net.mindview.util.Print.*;

class SelfCounter{
    private static int count;
    private int id = count++;
    public String toString(){return "SelfCounter "+id;}
}

class WithFinalFields{
    final SelfCounter scf = new SelfCounter();
    static final SelfCounter sscf = new SelfCounter();
    public String toString(){
        return "scf = "+scf+"\nsscf = "+sscf;
    }
}

public class HomeWork18 {
    public static void main(String[] args) {
        print("First object:");
        print(new WithFinalFields());
        print("Second object:");
        print(new WithFinalFields());
    }
}

