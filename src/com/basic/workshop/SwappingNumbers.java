package com.basic.workshop;

public class SwappingNumbers {

    public static void main (String[] args) {

        int first = 10, second = 20, temp;

        System.out.println("--Before Swap--");
        System.out.println("First Number = " + first);
        System.out.println("Second Number = " + second);

        temp = first;

        first = second;

        second = temp;

        System.out.println("--After Swap--");
        System.out.println("First Number = " + first);
        System.out.println("Second Number = " + second);

    }
}




