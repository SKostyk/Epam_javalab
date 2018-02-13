package com.company;

public class Main {
    public static void main (String[]args){
        Data variables = new Data();
        variables.a = 200;
        variables.b = 25.6f;
        variables.c = true;
        System.out.println(variables.a);
        System.out.println(variables.b);
        System.out.println(variables.c);
    }

    public static class Data {
        public int a;
        public float b;
        public boolean c;
    }
}