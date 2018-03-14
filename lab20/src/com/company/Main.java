package com.company;
import java.util.Random;
public class Main {
    public static int number1;
    public static int number2;
    public static void main(String[]args){
        Random random = new Random();
        number1 = random.nextInt(25);
        number2 = random.nextInt(25);
        if(number1 > number2)
            System.out.println(number1 + " > " + number2);
        else if (number1 < number2)
            System.out.println(number1 + " < " + number2);
        else
            System.out.println(number1 + " = " + number2);
    }
}