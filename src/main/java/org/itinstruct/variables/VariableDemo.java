package org.itinstruct.variables;

public class VariableDemo {
    int a = 10; //instance variable
    static int b = 20;  //class variable
    int x;
    int a1, b1, c1;
    int a2 = 20, b2, c2 = 35;
    public static void main(String[] args) {
        Company obj1 = new Company();
        Company obj2 = new Company();

        obj2.name = "TCS";
        obj2.empCount = 150000;

        System.out.println("Company Name: " + obj1.name);
        System.out.println("EmployeeCount: "  + obj1.empCount);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Company Name: " + obj2.name);
        System.out.println("EmployeeCount: "  + obj2.empCount);
    }
}

class Company{
    static String name = "IBM";
    int empCount = 100000;
}