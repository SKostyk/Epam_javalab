package com.company;

import com.sun.org.apache.xpath.internal.operations.Plus;

public class Main {
    public static void main(String[]args){
        New Plus = new New();
        Plus.a = 10;
        Plus.b = 90;
        Plus.result = Plus.a + Plus.b;
        System.out.println(Plus.result);
    }
}