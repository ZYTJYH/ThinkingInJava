package com.zytjyh.seven.four;

import com.zytjyh.seven.two.HomeWork8;

import static net.mindview.util.Print.*;
class A {
    char doh(char c) {
        print("doh(char)");
        return 'd';
    }

    float doh(float f) {
        print("doh(float)");
        return 1.0f;
    }

    int doh(int i) {
        print("doh(int)");
        return 1;
    }
}
public class HomeWork13 extends A{
    double doh(double d){
        print("doh(double)");
        return 1.0;
    }
    public static void main(String[] args){
        HomeWork13 h=new HomeWork13();
        h.doh(1.0f);
        h.doh(1);
        h.doh('a');
        h.doh(1.0);
    }

}
