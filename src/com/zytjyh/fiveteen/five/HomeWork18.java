package com.zytjyh.fiveteen.five;

import com.zytjyh.fiveteen.four.Generators;
import net.mindview.util.Generator;

import java.util.*;

class LittleFish{
    private static long counter = 1;
    private final long id = counter ++;
    private LittleFish(){}
    public String toString(){return "Little "+id;}
    public static Generator<LittleFish> generator(){
        return new Generator<LittleFish>() {
            @Override
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}

class BigFish{
    private static long counter=1;
    private final long id=counter++;
    private BigFish(){}
    public String toString(){
        return "BigFish "+id;
    }
    public static Generator<BigFish> generator=new Generator<BigFish>() {
        @Override
        public BigFish next() {
            return new BigFish();
        }
    };
}
public class HomeWork18 {
    public static void serve(BigFish b,LittleFish l){
        System.out.println(b+" eat "+l);
    }
    public static void main(String[] args){
        Random rand=new Random(47);
        Queue<LittleFish> line =new LinkedList<LittleFish>();
        Generators.fill(line,LittleFish.generator(),15);
        List<BigFish> line2=new ArrayList<BigFish>();
        Generators.fill(line2,BigFish.generator,4);
        for(LittleFish c:line)
            serve(line2.get(rand.nextInt(line2.size())),c);
    }

}
