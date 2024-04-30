package org.itinstruct.demo;

import java.util.ArrayList;

public class Java8Features {
    public static void main(String[] args) {
        MyInterFace myInterFace = (String str) -> System.out.println("Welcome " + str);

        myInterFace.printName("Java");
    }

    static void forEachTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num =0 ;num<10; num++)
            arrayList.add(num);
        arrayList.forEach(n -> {printNum(n);});
    }

    static void printNum(int num) {
        System.out.println(num);
    }
}

interface MyInterFace {
    void printName(String str);
}