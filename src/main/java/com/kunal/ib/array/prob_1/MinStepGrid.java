package com.kunal.ib.array.prob_1;

/*
You are given a sequence of points and the order in which you need to cover the points.
Give the minimum number of steps in which you can achieve it. You start from the first point.
Given two integer arrays A and B, where A[i] is x coordinate and B[i] is y coordinate of ith point respectively.
 */

import java.util.ArrayList;

public class MinStepGrid {

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
       //Test case -1 : A.add(0);   B.add(-1);
        /*Test case -2 :
        A.add(-2); A.add(0); A.add(2);
        B.add(-2); B.add(1); B.add(3);*/

        /*
            Test case -3:
         A.add(-2);   A.add(-1);
           B.add(-2);   B.add(-1);*/

           /*
           Test Case -4:

           A.add(-2);   A.add(2);
           B.add(2);    B.add(-2);*/

        MinStepGrid msg=new MinStepGrid();

        System.out.println(msg.coverPoints(A,B));



    }

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {

        int distanceBetwX=0;
        int distanceBetwY=0;

        int numberOfSetps=0;

        for(int i=1;i<A.size();i++){

            distanceBetwX=Math.abs(A.get(i)-A.get(i-1));
            distanceBetwY=Math.abs(B.get(i)-B.get(i-1));

            numberOfSetps=numberOfSetps+Math.max(distanceBetwX,distanceBetwY);

        }


        return numberOfSetps;
    }



}
