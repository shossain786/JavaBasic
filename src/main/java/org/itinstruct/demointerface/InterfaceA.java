package org.itinstruct.demointerface;

public interface InterfaceA {
    void methodA();

    default void display(){
        System.out.println("Hello drom Interface display method");
    }

    static void printHello(){
        System.out.println("hello form InterfaceA printHello method");
    }
}
