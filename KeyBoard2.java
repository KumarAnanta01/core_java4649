package core;

import java.util.Scanner;

public class KeyBoard2 {

    public static void main(String[] args) {

        Scanner s2=new Scanner(System.in);

        String name;

        System.out.println("may i know you name ");

        name = s2.nextLine();

        System.out.println("welcome mr/miss "+name);


    }
}
