package com.kunal.ib.array.prob_2;

import java.util.ArrayList;
import java.util.Iterator;

public class MaxSubArray {

    public static void main(String[] args) {

        ArrayList<SubArray> subArrayList=new ArrayList<>();
        Integer[] array={1, 2, 5, -7, 2, 3};

        MaxSubArray maxSubArray=new MaxSubArray();
        System.out.println(maxSubArray.maxSubArray(array));

    }

    public Integer maxSubArray(Integer[] A){

        ArrayList<Integer> subArray=null;
        ArrayList<SubArray> subArrayList=new ArrayList<>();

        SubArray subArrayIntance=null;
        Integer subArrayLength=0;
        int sum=0;

        subArray=new ArrayList<>();
        for(int i=0;i<A.length;i++){

            if(A[i]>0){


                sum=sum+A[i];
                subArray.add(A[i]);
                subArrayLength++;
            }else if(A[i]<0 && subArray.size()>0){

                subArrayIntance=addSubArrayToList(subArray,subArrayLength,sum);//new SubArray();
                subArrayList.add(subArrayIntance);
                sum=0;  subArrayLength=0;
                subArray=new ArrayList<>();
            }
        }

        subArrayIntance=addSubArrayToList(subArray,subArrayLength,sum);
        subArrayList.add(subArrayIntance);

        int maxSum=0;
        SubArray maxSubArrayInstance=null;

        for(SubArray sa:subArrayList){

            if(sa.getSum()>sum){
                maxSum=sa.getSum();
                maxSubArrayInstance=sa;
            }
        }

        System.out.println(maxSubArrayInstance.toString());
        return maxSum;

    }

    private SubArray addSubArrayToList(ArrayList<Integer> subArray,int subArrayLength,int sum){

        SubArray subArrayIntance=new SubArray();
        subArrayIntance.setSubArray(subArray);
        subArrayIntance.setLenthOfSubArray(subArrayLength);
        subArrayIntance.setStartNumOfSubArray(subArray.get(0));
        subArrayIntance.setSum(sum);

        return subArrayIntance;
    }


}


class SubArray{

    private ArrayList<Integer> subArray;
    private int lenthOfSubArray;
    private Integer startNumOfSubArray;
    private int sum;

    public ArrayList<Integer> getSubArray() {
        return subArray;
    }

    public void setSubArray(ArrayList<Integer> subArray) {
        this.subArray = subArray;
    }

    public Integer getLenthOfSubArray() {
        return lenthOfSubArray;
    }

    public void setLenthOfSubArray(Integer lenthOfSubArray) {
        this.lenthOfSubArray = lenthOfSubArray;
    }

    public Integer getStartNumOfSubArray() {
        return startNumOfSubArray;
    }

    public void setStartNumOfSubArray(Integer startNumOfSubArray) {
        this.startNumOfSubArray = startNumOfSubArray;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "SubArray{" +
                "subArray=" + subArray +
                ", lenthOfSubArray=" + lenthOfSubArray +
                ", startNumOfSubArray=" + startNumOfSubArray +
                ", sum=" + sum +
                '}';
    }
}
