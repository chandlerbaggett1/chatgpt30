package org.example;

import java.time.LocalDate;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new Random().ints(1, 31)
                .distinct()
                .limit(2)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(LocalDate.now() + " Leetcode problems of the day: ");
        set.forEach(System.out::println);
    }
}