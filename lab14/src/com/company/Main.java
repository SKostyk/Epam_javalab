package com.company;
public class Main {
    public static void main(String[]args){
        Float F = new Float();
        F.f = 4.76f;
        System.out.println("1: F.var: " + F.f);
        PassObject.f(F);
        System.out.println("2: F.var: " + F.f);
    }
}