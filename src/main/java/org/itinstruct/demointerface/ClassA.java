package org.itinstruct.demointerface;

public class ClassA implements InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Hello from methodA inside ClassA");
    }

    @Override
    public void methodB() {
        System.out.println("Hello from methodB inside ClassA");
    }
}
