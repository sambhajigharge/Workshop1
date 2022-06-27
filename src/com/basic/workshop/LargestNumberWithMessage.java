package com.basic.workshop;
import java.util.Scanner;

public class LargestNumberWithMessage {
     public static void main (String[] args) {
         int a;
         int b;
         int c;
         Scanner sc = new Scanner (System.in);

         System.out.println("Enter first number");
         a = sc.nextInt();

         System.out.println("Enter second number");
         b = sc.nextInt();

         System.out.println("Enter third number");
         c = sc.nextInt();

         if (a >= b || a >= c) {
             System.out.println("a is largest number " + a);
         }
             else if (b >= a && b >= c) {
                 System.out.println("b is largest number " + b);
             }
                 else
         {
                 System.out.println("c is largest number " + c);

         }
     }
}
