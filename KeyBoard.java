package core;

import java.util.Scanner;

public class KeyBoard {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter two numbers");

        a = s1.nextInt();

        b = s1.nextInt();

        c = a + b;

        System.out.println("The Sum of the two Numbers is "+c);

    }
}
