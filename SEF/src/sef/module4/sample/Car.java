package sef.module4.sample;

import java.sql.SQLOutput;

abstract class Car {
    static{
        System.out.println("Static block is invoked");
    }

    public static void main(String args[]) {
        System.out.println("Hello main");
    }
}
