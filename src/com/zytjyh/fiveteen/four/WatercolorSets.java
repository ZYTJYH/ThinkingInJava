package com.zytjyh.fiveteen.four;

import java.util.EnumSet;
import java.util.Set;

import static com.zytjyh.fiveteen.four.WaterColors.*;
import static net.mindview.util.Print.print;
import static net.mindview.util.Sets.*;

public class WatercolorSets {
    public static void main(String[] args){
        Set<WaterColors> set1= EnumSet.range(BRILLIANT_RED,VIRIDIAN_HUE);
        Set<WaterColors> set2= EnumSet.range(CERULEAN_BLUE_HUE,BURNT_UMBER);
        print("set1:"+set1);
        print("set2:"+set2);
        print("union(set1, set2): "+union(set1, set2));
        Set<WaterColors> subset=intersection(set1,set2);
        print("intersection(set1,set2): "+subset);
        print("difference(set1,subset): "+difference(set1,subset));
        print("difference(set2,subset): "+difference(set2,subset));
        print("complement(set1,set2): "+complement(set1,set2));
    }

}
