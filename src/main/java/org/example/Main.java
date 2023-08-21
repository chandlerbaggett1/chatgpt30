package org.example;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new Random().ints(1, 31)
                .distinct()
                .limit(2)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println("problems of the day: ");
        set.forEach(System.out::println);
    }
}