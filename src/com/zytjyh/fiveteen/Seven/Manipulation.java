package com.zytjyh.fiveteen.Seven;

class Manipulator<T>{
    private T obj;
    public Manipulator(T x){
        obj=x;
    }
    public void manipulate(){
       // obj.f();
    }
}
class Manipulator2<T extends HasF>{
    private T obj;
    public Manipulator2(T x){
        obj=x;
    }
    public void manipulate(){
         obj.f();
    }
}

class Manipulator3{
    private HasF obj;
    public Manipulator3(HasF x){
        obj=x;
    }
    public void manipulate(){
        obj.f();
    }
}

class ReturnGenericType<T extends HasF>{
    private T obj;
    public ReturnGenericType(T x){obj=x;}
    public T get(){return obj;}
}

public class Manipulation {
    public static void main(String[] args){
        HasF hf=new HasF();
        Manipulator<HasF> manipulator=new Manipulator<HasF>(hf);
        manipulator.manipulate();
    }

}
