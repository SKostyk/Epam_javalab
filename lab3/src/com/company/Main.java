package com.company;

import com.sun.org.apache.xpath.internal.operations.Plus;

public class Main {
    public static void main(String[]args){
        New rg = new New();
        rg.a = 10;
        rg.b = 90;
        rg.result = rg.a + rg.b;
        System.out.println(Plus.result);
    }
}
