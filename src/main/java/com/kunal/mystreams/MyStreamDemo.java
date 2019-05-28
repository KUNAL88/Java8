package com.kunal.mystreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStreamDemo {

    public static void main(String[] args) {

        List<Integer> l=new ArrayList<>();
        l.add(0);   l.add(5);   l.add(15);
        l.add(10);  l.add(20);  l.add(30);

        System.out.println("After Map \n"+l);

        Stream<Integer> s=l.stream().map(i-> i+2);
        List<Integer> l1=s.collect(Collectors.toList());
        System.out.println("\nAfter Map \n"+l1);

        Stream<Integer> s1=l.stream().filter(i -> i%2==0);
        System.out.println("\n After Filter \n "+(s1.collect(Collectors.toList())));


    }

}
