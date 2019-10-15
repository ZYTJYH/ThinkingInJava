package com.zytjyh.fiveteen.Eight.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static net.mindview.util.Print.print;

class Building {}
class House extends Building {
    private String location;
    private Integer area;
    public House() { location = null; }
    public House(Integer area) { this.area = area; }
    public House(String location) {
        this.location = location;
    }
    public House(String location, Integer area) {
        this.location = location;
        this.area = area;
    }
    public String toString() {
        return "House" + ((location == null) ? "" :  " in " + location) +
                ((area != null) ? (", "+ area + " sqft") : "");
    }
}

public class HomeWork22<T> {
    Class<?> kind;
    public HomeWork22(Class<?> kind) {
        this.kind = kind;
    }
    public Object createNew(String typename)
            throws 	IllegalAccessException,
            InstantiationException,
            ClassNotFoundException {
        System.out.println(typename);
        return Class.forName("com.zytjyh.fiveteen.Eight.homework."+typename).newInstance();
    }
    /** To create instance of typename with constructors taking arguments args: */
    public Object createNew(String typename, Object... args)
            throws 	IllegalAccessException,
            InstantiationException,
            ClassNotFoundException,
            NoSuchMethodException,
            InvocationTargetException {
        System.out.println(args.length);
        switch(args.length) {
            case 1 :
                return Class.forName("com.zytjyh.fiveteen.Eight.homework."+typename).getConstructor(args[0].getClass()).newInstance(args[0]);
            case 2 : return Class.forName("com.zytjyh.fiveteen.Eight.homework."+typename).getConstructor(args[0].getClass(), args[1].getClass()).
                    newInstance(args[0], args[1]);
        }
        System.out.println(args.length);
        return null;
    }
    public static void main(String[] args) {
        HomeWork22<Building> ctcb = new HomeWork22<Building>(Building.class);
        HomeWork22<House> ctch = new HomeWork22<House>(House.class);
        try {
            Building b = (Building)ctcb.createNew("Building");
            // To show we can access and print House constructors:
            print("House constructors:");
            Constructor[] ctors = House.class.getConstructors();
            for(Constructor ctor : ctors) print(ctor);
            // create 3 new House objects:
            House h = (House)ctch.createNew("House", "Hawaii");
            House h2 = (House)ctch.createNew("House", 3000);
            House h3 = (House)ctch.createNew("House", "Manila", 5000);
            print("Constructed House objects:");
            print(h);
            print(h2);
            print(h3);
        } catch(IllegalAccessException e) {
            print("IllegalAccessException in main");
        } catch(InstantiationException e) {
            print("InstantiationException in main");
        } catch(ClassNotFoundException e) {
            print("ClassNotFoundException in main");
        } catch(NoSuchMethodException e) {
            print("NoSuchMethodException in main");
        } catch(InvocationTargetException e) {
            print("InvocationTargetException in main");
        }
    }
}
