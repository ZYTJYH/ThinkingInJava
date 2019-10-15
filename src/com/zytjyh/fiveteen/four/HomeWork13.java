package com.zytjyh.fiveteen.four;

import com.zytjyh.fiveteen.three.Coffee;
import com.zytjyh.fiveteen.three.CoffeeGenerator;
import net.mindview.util.Generator;

import java.util.*;

public class HomeWork13 {
    public static <T> Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n){
        for(int i=0;i<n;i++)
            coll.add(gen.next());
        return coll;
    }
    public static <T> List<T>
    fill(List<T> coll, Generator<T> gen, int n){
        System.out.println(1);
        for(int i=0;i<n;i++)
            coll.add(gen.next());
        return coll;
    }
    public static <T> Queue<T>
    fill(Queue<T> coll, Generator<T> gen, int n){
        for(int i=0;i<n;i++)
            coll.add(gen.next());
        return coll;
    }
    public static <T> Set<T>
    fill(Set<T> coll, Generator<T> gen, int n){
        for(int i=0;i<n;i++)
            coll.add(gen.next());
        return coll;
    }
    public static <T> LinkedList<T>
    fill(LinkedList<T> coll, Generator<T> gen, int n){
        System.out.println(2);
        for(int i=0;i<n;i++)
            coll.add(gen.next());
        return coll;
    }
    public static void main(String[] args){
        List<Coffee> coffee1=fill(new ArrayList<>(),new CoffeeGenerator(),4);
        LinkedList<Coffee> coffee2=fill(new LinkedList<>(),new CoffeeGenerator(),4);
    }
}
