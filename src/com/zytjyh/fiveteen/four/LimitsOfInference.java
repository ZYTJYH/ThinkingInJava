package com.zytjyh.fiveteen.four;

import net.mindview.util.New;

import java.util.List;
import java.util.Map;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople){}
    public static void main(String[] args){
        System.out.println(New.map());
        f(New.map());
    }
}
