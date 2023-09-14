package com.mytutos.springtest;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int minus(int d, int e) {
        return d - e;
    }

}
