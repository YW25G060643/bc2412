package com.bootcamp.demo;

public class calculator {

    public static int methodB(int a){
        return a + sum(a, a + 2);
    }
    public static int sum(int x, int y){
        return x + y - 1 ;
    }
}
