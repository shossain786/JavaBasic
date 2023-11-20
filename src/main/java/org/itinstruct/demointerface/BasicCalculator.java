package org.itinstruct.demointerface;

public class BasicCalculator implements Calculator{
    @Override
    public void sum(int num1, int num2) {
        System.out.println("Sum from BasicCalculator: "  + (num1+num2));
    }

    @Override
    public void sub(int num1, int num2) {
        System.out.println("Sub from BasicCalculator: "  + (num1-num2));
    }

    @Override
    public void multiplication(int num1, int num2) {
        System.out.println("Mul from BasicCalculator: "  + (num1*num2));
    }

    @Override
    public void dev(int num1, int num2) {
        System.out.println("Dev from BasicCalculator: "  + (num1/num2));
    }
}
