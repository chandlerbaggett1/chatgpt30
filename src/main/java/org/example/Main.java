package org.example;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the LeetCode Problem Selector!");
        System.out.println("         (\\_/)");
        System.out.println("        (^_^)");
        System.out.println("        c(\")(\")");
        System.out.println("Please enter the number of problems you'd like to select:");

        Scanner scanner = new Scanner(System.in);
        int numberOfProblems = scanner.nextInt();

        Set<Integer> set = new Random().ints(1, 31)
                .distinct()
                .limit(numberOfProblems)
                .boxed()
                .collect(Collectors.toSet());

        System.out.println(LocalDate.now() + " LeetCode problems of the day:");
        set.forEach(System.out::println);
    }
}
