package core;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        sc1.useRadix(2);
        int x=sc1.nextInt();

        System.out.println(x);
    }
}
