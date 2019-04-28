package com.zytjyh.five.nine;

enum Money{
    ONE,
    TWO,
    FIVE,
    TEN,
    FIVTY,
    HUNDRED
}
public class HomeWork21 {

    public static void main(String[] args) {
        for(Money m : Money.values()){
            System.out.println(m + " " + m.ordinal());
        }

    }

}
