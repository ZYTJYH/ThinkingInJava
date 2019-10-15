package com.zytjyh.fiveteen.Eight;

import java.util.HashMap;
import java.util.Map;


import static net.mindview.util.Print.print;


public class HomeWork21<T> {
    Class<T> kind;
    Map<String,Class<?>> map;
    public void addType(String typename,Class<?>kind){
        map.put(typename,kind);
    }
    public Object createNew(String typename)throws IllegalAccessException,InstantiationException{
        if(map.containsKey(typename))
            return map.get(typename).newInstance();
        System.out.println(typename + " class not available");
        return null;
    }
    public HomeWork21(Class<T> kind){
        this.kind=kind;
    }
    public HomeWork21(Class<T> kind,Map<String,Class<?>> map){
        this.kind=kind;
        this.map=map;
    }
    public boolean f(Object arg){
        return kind.isInstance(arg);
    }
    public static void main(String[] args){
        HomeWork21<Building> ctt1 = new HomeWork21<>(Building.class);
        System.out.println(ctt1);
        System.out.println(ctt1.f(new House()));
        HomeWork21<House> ctt2 = new HomeWork21<>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
        HomeWork21<Building> ct =
                new HomeWork21<Building>(Building.class, new HashMap<String, Class<?>>());
        ct.addType("House", House.class);
        ct.addType("Building", Building.class);
        print("ct.map = " + ct.map);
        try {
            Building b = (Building)ct.createNew("Building");
            House h = (House)ct.createNew("House");
            print("b.getClass().getName(): ");
            print(b.getClass().getName());
            print("h.getClass().getName(): ");
            print(h.getClass().getName());
            print("House h is instance House: ");
            print(h instanceof House);
            print("House h is instance of Building: ");
            print(h instanceof Building);
            print("Building b is instance of House: ");
            print(b instanceof House);
            ct.createNew("String");  // String class not available
        } catch(IllegalAccessException e) {
            print("IllegalAccessException in main");
        } catch(InstantiationException e) {
            print("InstantiationException in main");
        }
    }
}
