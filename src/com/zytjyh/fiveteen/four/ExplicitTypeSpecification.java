package com.zytjyh.fiveteen.four;

import net.mindview.util.New;

import java.util.List;
import java.util.Map;

public class ExplicitTypeSpecification {
    void test(){
        New.<Person,List<Pet>>map();
    }
    static void f(Map<Person, List<Pet>> petPeople){}
    public static void main(String[] args){
        f(New.<Person,List<Pet>> map());
    }

}
