package com.driver;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("Rushabh");
        out.println(obj.getName());
    }
}