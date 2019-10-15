package com.zytjyh.fiveteen.two;

import java.util.ArrayList;
import java.util.Random;

public class HomeWork6<T> {
    private ArrayList<T> storage=new ArrayList<T>();
    private Random rand=new Random(47);
    public void add(T item){storage.add(item);}
    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }
    public static void main(String[] args){
        RandomList<Integer> A=new RandomList<Integer>();
        RandomList<Double> B=new RandomList<Double>();
        int[] a={1,2,3,4,5,6};
        double[] b={1,2,3,4,5,6.0};
        for(int i=0;i<6;i++){
            A.add(a[i]);
            B.add(b[i]);
        }
        for(int i=0;i<6;i++){
            System.out.println(A.select()+" "+B.select());
        }
    }
}
