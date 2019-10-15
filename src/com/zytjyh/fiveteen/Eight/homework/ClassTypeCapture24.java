package com.zytjyh.fiveteen.Eight.homework;

import java.util.HashMap;
import java.util.Map;

import static net.mindview.util.Print.print;

interface Factory<T> {
    T create();
}



class BuildingFactory implements Factory<Building> {
    public Building create() {
        return new Building();
    }
}

class HouseFactory implements Factory<House> {
    public House create() {
        return new House();
    }
}

public class ClassTypeCapture24<T> {
    Class<?> kind;
    public ClassTypeCapture24(Class<?> kind) {
        this.kind = kind;
    }
    Map<String,Factory> map;
    public ClassTypeCapture24(Class<?> kind, Map<String,Factory> map) {
        this.kind = kind;
        this.map = map;
    }
    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }
    public void addType(String typename, Factory factory) {
        map.put(typename, factory);
    }
    public Object createNew(String typename)
            throws IllegalAccessException, InstantiationException {
        if(map.containsKey(typename))
            return map.get(typename).create();
        System.out.println(typename + " class not available");
        return null;
    }
    public static void main(String[] args) {
        ClassTypeCapture24<Building> ctt1 =
                new ClassTypeCapture24<Building>(Building.class);
        print(ctt1.f(new Building()));
        print(ctt1.f(new House()));
        ClassTypeCapture24<House> ctt2 =
                new ClassTypeCapture24<House>(House.class);
        print(ctt2.f(new Building()));
        print(ctt2.f(new House()));
        ClassTypeCapture24<Building> ct =
                new ClassTypeCapture24<Building>(
                        Building.class, new HashMap<String,Factory>());
        ct.addType("House", new HouseFactory());
        ct.addType("Building", new BuildingFactory());
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
