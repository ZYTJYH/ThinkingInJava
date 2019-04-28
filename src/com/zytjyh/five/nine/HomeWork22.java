package com.zytjyh.five.nine;


public class HomeWork22 {
    Money value;
    public HomeWork22(Money value){
        this.value = value;
    }

    public void printValue(){
        switch(value){
            case ONE:
                System.out.println("1元面值");
                break;
            case TWO:
                System.out.println("2元面值");
                break;
            case FIVE:
                System.out.println("5元面值");
                break;
            case TEN:
                System.out.println("10元面值");
                break;
            case HUNDRED:
                System.out.println("100元面值");
                break;
        }
    }


    public static void main(String[] args) {
        HomeWork22 t = new HomeWork22(Money.ONE);
        HomeWork22 t2 = new HomeWork22(Money.TWO);
        HomeWork22 t3 = new HomeWork22(Money.HUNDRED);
        t.printValue();
        t2.printValue();
        t3.printValue();
    }
}
