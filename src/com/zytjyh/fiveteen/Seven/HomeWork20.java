package com.zytjyh.fiveteen.Seven;

interface Test{
    public void test1();
    public void test2();
}
class A implements Test{

    @Override
    public void test1() {
        System.out.println("1");
    }

    @Override
    public void test2() {
        System.out.println("2");
    }
    public void test3(){
        System.out.println("3");
    }

}
class B{
    public static <T extends Test> void test4(T t){
        t.test1();
        t.test2();
    }
}
public class HomeWork20 {
    public static void main(String[] args){
        A a = new A();
        B.test4(a);
    }

}
