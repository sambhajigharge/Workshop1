package com.basic.workshop;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SortArrayOf0and1 {
    public static void sortBinaryArray(int[] inputArray) {
        int zeroCount = 0 ;
        System.out.println("Input Array Before Sorting : "+ Arrays.toString(inputArray));
        //Counting the zeros..
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0 ) {
                zeroCount++;
            }
        }
        //Rewriting the array with zero...
        for (int i = 0; i < zeroCount; i++) {
            inputArray[i] = 0;
        }
        //.....and remaining places with 1s
        for (int i = zeroCount; i < inputArray.length; i++) {
            inputArray[i] = 1;
        }
        System.out.println("Input Array After Sorting : " + Arrays.toString(inputArray));
    }
    public static void main(String[] args) {
        sortBinaryArray(new int[] {1, 0, 1, 0, 1, 0, 1, 0, 0});
    }
}
