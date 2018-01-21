package com.brainacad.oop.testcollection1;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] strings) {

        System.out.println("******************************************");
        System.out.println("Labwork 2.15.1");
        System.out.println("--------------------------------------------");

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            list.add("number_" + i);
        }

        for (String s : list) {
            System.out.println(s);

        }

        System.out.println("******************************************");
    }
}
