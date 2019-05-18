package com.kunal.mypredicate;

import java.util.function.Predicate;

/*
Predicate is pre-defined functional interface in Java-8
it have public abstract void test(T)
T=argument type
 */
public class MyPredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> p= i -> i>10;

        System.out.println(p.test(100));
        System.out.println(p.test(3));

    }
}
