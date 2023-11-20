package org.itinstruct.demointerface;

public class AdvanceCalculator implements Calculator{
    @Override
    public void sum(int num1, int num2) {
        System.out.println("Sub from AdvanceCalculator: "  + (num1+num2));
    }

    @Override
    public void sub(int num1, int num2) {

    }

    @Override
    public void multiplication(int num1, int num2) {

    }

    @Override
    public void dev(int num1, int num2) {

    }

    public void calculateArea(){
        System.out.println("Area calculation from Advance Calculator");
    }
}
