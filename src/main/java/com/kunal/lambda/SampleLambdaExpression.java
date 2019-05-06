package com.kunal.lambda;

interface Sample{

    public abstract void sum(int a,int b);  //functional Interface

}


public class SampleLambdaExpression {

    public static void main(String[] args) {

       Sample s= (a,b) -> System.out.println(a+b);

       s.sum(10,20);

    }

}
