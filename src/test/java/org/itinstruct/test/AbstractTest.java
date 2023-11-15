package org.itinstruct.test;

import org.itinstruct.demoabstract.Cat;
import org.itinstruct.demoabstract.Dog;

public class AbstractTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.breathing();
        cat.eating();

        System.out.println("----------------------------");
        Dog dog = new Dog();
        dog.breathing();
        dog.eating();

    }
}

// why to use abstract class concept?
// final