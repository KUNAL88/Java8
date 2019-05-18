package com.kunal.java8_functional_intrf.myconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
Consumer<T> is predefined functional interface , it have
public abstract void consume(T)
 */
public class MyConsumerDemo {

    public static void main(String[] args) {

        List<String> l=new ArrayList<>();
        l.add("kunal"); l.add("bala");  l.add("sharma");

        Consumer<List<String>> c= l1 -> {

            for (String temp:l1){
                System.out.println("Length of String "+temp+" : "+temp.length());
            }
        };

        c.accept(l);
    }
}
