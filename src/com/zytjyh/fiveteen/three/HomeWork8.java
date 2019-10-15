package com.zytjyh.fiveteen.three;

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

class StoryCharacters{
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
class GoodGuys extends StoryCharacters{

}
class BadGuys extends StoryCharacters{

}
public class HomeWork8 implements Generator<StoryCharacters>,Iterable<StoryCharacters> {
    private Class[] types={GoodGuys.class,BadGuys.class};
    private static Random rand=new Random(47);
    public HomeWork8(){}
    private int size=0;
    public HomeWork8(int sz){size=sz;}
    class StoryCharactersIterator implements Iterator<StoryCharacters>{
        int count=size;
        @Override
        public boolean hasNext() {
            return count>0;
        }

        @Override
        public StoryCharacters next() {
            count--;
            return HomeWork8.this.next();
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }
    @Override
    public Iterator<StoryCharacters> iterator() {
        return new StoryCharactersIterator();
    }

    @Override
    public StoryCharacters next() {
        try{
            return (StoryCharacters)types[rand.nextInt(types.length)].newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        HomeWork8 gen=new HomeWork8();
        for(int i=0;i<5;i++){
            System.out.println(gen.next());
        }
        for(StoryCharacters s:new HomeWork8(8))
            System.out.println(s);
    }


}
