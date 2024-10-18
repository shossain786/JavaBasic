package org.itinstruct.variables;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        printFormattedText();
    }


// #! Q1. I have a text SaddamHossain. Help me to write a code in python in order to print in like [Saddam][Hossain]


    static void printFormattedText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = scanner.next();

        String[] parts = text.split("(?=[A-Z])");
        StringBuilder newText = new StringBuilder();
        for (String part : parts) {
            newText.append("[").append(part).append("]");
        }

        System.out.println(newText);
    }
}