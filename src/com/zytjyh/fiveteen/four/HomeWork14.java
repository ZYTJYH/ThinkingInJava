package com.zytjyh.fiveteen.four;

import net.mindview.util.Generator;

public class HomeWork14 {
    public static void main(String[] args){
        Generator<CountedObject> gen=new BasicGenerator(CountedObject.class);
        for(int i=0;i<5;i++)
            System.out.println(gen.next());
    }
}
