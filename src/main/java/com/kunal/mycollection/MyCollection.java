package com.kunal.mycollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyCollection {

    public static void main(String[] args) {

        List l=new LinkedList();
        l.add(10);
        l.add(01);
        l.add(255);
        l.add(100);

        System.out.println(l);

        Collections.sort(l,new MyComparator());
        System.out.println(l);
    }

}
