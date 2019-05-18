package com.kunal.mysupplier;

import java.util.function.Supplier;

/*
Producer<R> functional interface, it has
public abstract R get() method
 */
public class MySupplierDemo {

    public static void main(String[] args) {

        Supplier<Double> s=() -> Math.random();

        System.out.println(s.get());
        System.out.println(s.get());

    }
}
