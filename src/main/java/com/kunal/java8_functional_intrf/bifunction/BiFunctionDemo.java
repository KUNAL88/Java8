package com.kunal.java8_functional_intrf.bifunction;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionDemo {

    public static void main(String[] args) {

        BiPredicate<Integer,String> p=(age,name) -> {

            if(age>18 && name.startsWith("k")){
                return true;
            }else {
                return false;
            }
        };

        System.out.println(p.test(19,"kunal"));

        BiFunction<Integer,String,String> f=(age,name) -> age+name;
        System.out.println(f.apply(1,"kunal"));

       // BiConsumer<>


    }
}
