package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String st1, st2;
        System.out.print("Введіть текст: ");
        st1 = scan.nextLine();
        System.out.print("Введіть текст: ");
        st2 = scan.nextLine();

        if (st1.equals(st2)){
            System.out.println("true");
        }
        else
            System.out.println("false");

    }
}
