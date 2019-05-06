package com.kunal.mycollection;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    public int compare(Integer obj1,Integer obj2){

        return obj1>obj2 ? 1:obj1<obj2 ? -1:0;
    }

}
