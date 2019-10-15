package com.zytjyh.fiveteen.four;


import net.mindview.util.New;

import java.util.List;
import java.util.Map;

class Person{

}
class Pet{

}
public class SimplePets {
    public static void main(String[] args){
        Map<Person, List<? extends Pet>> petPeople= New.map();
    }

}
