package com.basic.workshop;
        //Java program to fine the maximum in arr[]
public class LargestNumberInArray {
    static int arr[] = {10, 30, 60, 90, 80};

    // Method to find maximum in arr[]
    static int largest() {
        int i;
        int max = arr[0];   //Initialize maximum element

        //traverse array element from second and
        //compare every element the current max

        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
        //Driver method
        public static void main(String[] args) {
            System.out.println("Largest in given array is " + largest());
        }
}
