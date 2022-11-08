package org.example;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.leapYear;

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
        obj.checkString("Mumbai","Mumbai");

    }



    private void checkString( String s1, String s2) {
        if (s1.equals(s2))
        {
            System.out.println("String are equal");
        }
        else
        {
            System.out.println("String are different");
        }
        System.out.println("----------------------------------------");
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