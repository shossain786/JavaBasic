package org.itinstruct.test;

import org.itinstruct.demointerface.ClassA;
import org.itinstruct.demointerface.InterfaceA;

public class MultilevelInterfaceTest {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.methodA();;
        classA.methodB();
        classA.display();
        InterfaceA.printHello();
    }
}
