package org.itinstruct.demoabstract;

public abstract class Animal {
    public final void breathing() {   //implemented(concrete) method : it should have body( means it should
        // be associated with curly braces {})
        System.out.println("I take O2 and release CO2");
    }

    public abstract void eating(); // abstract method/un-implemented method
}

// we can not create object of an abstract class(because its contains unimplemented methods also)
// by using abstract keyword we have to create an abstract class
// an abstract class can have any number of implemented method or abstract method
// an abstract can not be final(because it have to be overridden)
// we can not use final keyword with abstract class name(reason: final keyword do not allow to extend the class to another)