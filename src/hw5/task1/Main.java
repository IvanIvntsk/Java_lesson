package hw5.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "apple",
                "banana",
                "orange",
                "pear",
                "cherry",
                "plum",
                "kiwi",
                "watermelon",
                "tangerine",
                "mandarin",
                "grapefruit",
                "pineapple",
                "grape",
                "peach",
                "apricot",
                "cantaloupe",
                "olive",
                "pomegranate",
                "lemon",
                "walnut"
        );
        List<String> collect =list.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(collect);

        List<String> Filterlist = list.stream().filter(a -> a.length() >= 4).collect(Collectors.toList());
        System.out.println(Filterlist);
    }
}
