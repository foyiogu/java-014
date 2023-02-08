package com.decagon.miniproject;

import java.util.EmptyStackException;

public class Main2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        try {
            c = b/a;
        }catch (ArithmeticException e){
            System.out.println("denominator is zero");
        }
        System.out.println("answer is "+ c);
    }
}
