package org.itinstruct.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;

//Java 11 features
public class StringOperations {
    public static void main(String[] args) throws IOException {
        varInLambda();
    }

    static void varInLambda() {
        IntStream.of(1,2,3,5,6,8,9,15)
                .filter((var i) -> i % 2 == 0)
                .forEach(System.out::print);
        System.out.println("\n");
        IntStream.of(1,2,3,5,6,8,9,15)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::print);
    }
    static void compareTwoFiles(String file1, String file2) throws IOException {
        System.out.println(Files.isSameFile(Path.of(file1), Path.of(file2)));
        System.out.println(Files.probeContentType(Path.of(file2)));
    }
    static void repeatString(String text, int count) {
        System.out.println(text.repeat(count));
    }

    static void writeFile(String filename, String content) throws IOException {
        Files.writeString(Path.of(filename), content);
    }

    static void readString(String fileName) throws IOException {
        System.out.println(Files.readString(Path.of(fileName)));
    }
}
