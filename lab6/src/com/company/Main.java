package com.company;

public class Main {

    public static void main(String[] args) {
        String ss = "Hi!!!";
        Storage(ss);
        System.out.println(Storage(ss) );
    }
    public static int Storage (String s){
        return s.length()*2;
    }
    }
}
