package org.example;

public class Main {
    int a;
    float b;
    boolean c;
    double d;
    long e;
    String s;

    public static void main(String[] args) {
        Main obj=new Main();
        obj.displayMessage();
        obj.printDefaultValues();
    }

    public void displayMessage() {
        System.out.println("Hello world!");
        System.out.println("----------------------------------------");
    }

    public void printDefaultValues() {
        System.out.println("int=" + a);
        System.out.println("float=" + b);
        System.out.println("boolean=" + c);
        System.out.println("double=" + d);
        System.out.println("long=" + e);
        System.out.println("String=" + s);
        System.out.println("----------------------------------------");
    }
}