package org.itinstruct.demointerface;

public class ClassB implements InterfaceC, InterfaceD{
    @Override
    public void methodC() {
        System.out.println("hello from methodC in ClassB");
    }

    @Override
    public void methodD() {
        System.out.println("hello from methodD in ClassB");
    }
}
