package com.zytjyh.fiveteen.Eight;

import java.util.ArrayList;
import java.util.List;

public class ListOfGenerics<T> {
    private List<T> array=new ArrayList<T>();
    public void add(T item){
        array.add(item);
    }

}
