package Basics;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer ");
        int a = sc.nextInt();
        System.out.println("Enter String");
        String s = sc.next();
        sc.nextLine();
        System.out.println("Enter Full Name");
        String fullName = sc.nextLine();
        System.out.println("Enter byte");
        byte b = sc.nextByte();
        System.out.println("Enter Byte");
        Byte B = sc.nextByte();

        System.out.println(a);
        System.out.println(s);
        System.out.println(fullName);
        System.out.println(b);
        System.out.println(B);

    }
}
