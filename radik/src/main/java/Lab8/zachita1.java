package Lab8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class zachita1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        List<Character> chars = fruits.stream()
                .flatMap(s -> s.chars().mapToObj(c -> (char)c))
                .collect(Collectors.toList());
        System.out.println(chars);
    }
}
