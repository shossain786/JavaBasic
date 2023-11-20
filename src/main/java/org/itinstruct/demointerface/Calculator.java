package org.itinstruct.demointerface;

public interface Calculator {
    void sum(int num1, int num2);

    void sub(int num1, int num2);
    void multiplication(int num1, int num2);
    void dev(int num1, int num2);


}

// for creating any interface we need to use interface keyword with its name
// file name and the interface name should exact same
// interface can not have method with body
// by default all the methods inside an interface are public
// we need to use implements keyword to implement an interface in a class
//