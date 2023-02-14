package Basics;

import java.util.*;

public class SumFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A");
        int a = sc.nextInt();
        System.out.println("Enter Number B");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum pf A and B is = " + c);
        sc.close();
    }
}
