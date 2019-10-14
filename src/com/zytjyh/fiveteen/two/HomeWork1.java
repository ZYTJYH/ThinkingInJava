package com.zytjyh.fiveteen.two;

class A{

}
class B extends A{

}
class C extends B{

}
public class HomeWork1 {
    public static void main(String[] args) {
        Holder3<A> a = new Holder3<>(new A());
        a.set(new B());
        a = new Holder3<>(new C());
    }
}
