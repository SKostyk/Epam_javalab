package com.company;
import java.util.Scanner;

public class Main {

    public static String womans = "woman";
    public static String mans = "man";
    public static String summer = "summer";
    public static String winter = "winter";

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        Man man = new Man();
        Woman woman = new Woman();

        System.out.println("Enter shoes women or man: ");
        String sex = scanner.next();

        System.out.println("Enter shoes season winter or summer: ");
        String season = scanner.next();

        System.out.println("Enter your size: ");
        int size = scanner.nextInt();

        if (sex.equals(womans)){
            if(season.equals(summer)){
                woman.setSizeAdidasSummerWoman(size);
                woman.setSizeArmaniSummerWomen(size);
                woman.setSizeGucciSummerWomen(size);
            }
            else if(season.equals(winter)){
                woman.setSizeAdidasWinterWoman(size);
                woman.setSizeArmaniWinterWoman(size);
                woman.setSizeGucciWinterWoman(size);
            }
            else
                System.out.println("Error");
        }
        if (sex.equals(mans)){
            if(season.equals(summer)){
                man.setSizeAdidasSummerMan(size);
                man.setSizeArmaniSummerMan(size);
                man.setSizeGucciSummerMan(size);
            }
            else if(season.equals(winter)){
                man.setSizeAdidasWinterMan(size);
                man.setSizeArmaniWinterMan(size);
                man.setSizeGucciWinterMan(size);
            }
            else
                System.out.println("Error");
        }
        else if(sex.equals(mans)){
            if(season.equals(summer)){

            }
            else if(season.equals(winter)){

            }
            else
                System.out.println("Error");
        }
        else
            System.out.println("This size is not available.Sorry");


    }
}
