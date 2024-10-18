package org.itinstruct.variables;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        printFormattedText();
//        printFormattedTextRegex();
    }


// #! Q1. I have a text SaddamHossain. Help me to write a code in python in order to print in like [Saddam][Hossain]

//  by checking the capital chars
    static void printFormattedText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = scanner.next();
        StringBuilder newText = new StringBuilder();
        newText.append("[");

        for (int i = 0; i< text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch) && i != 0)
                newText.append("][").append(ch);
            else
                newText.append(ch);
        }
        newText.append("]");
        System.out.println(newText);
    }

//    By using regex
    static void printFormattedTextRegex() {
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