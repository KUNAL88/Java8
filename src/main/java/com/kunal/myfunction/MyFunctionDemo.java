package com.kunal.myfunction;

import java.util.function.Function;

/*
Function<T,R> is pre-defined functional interface in java-8
it has public abstract R apply(T) method
where R = Return Type and T=Argument
 */
public class MyFunctionDemo {

    public static void main(String[] args) {

        Function<String,Integer> f=s->s.length();

        System.out.println("Length of String Kunal is "+f.apply("Kunal"));
        System.out.println("Length of String Bala is "+f.apply("Bala"));
    }
}
