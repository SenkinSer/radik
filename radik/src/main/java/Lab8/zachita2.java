package Lab8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class zachita2 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        List<Integer> lengths = fruits.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);
    }
}
