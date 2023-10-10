package hw5.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 7, 12, 6553, 213, 4326, 876, 234, 123, 4, 76, 87, 32, 87, 3232, 65, 234, 87);

        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1 = list.stream().filter(a -> a % 3 == 0).collect(Collectors.toList());
        System.out.println(collect1);

        List<Integer> collect2 = list.stream().filter(a -> a % 10 == 0).collect(Collectors.toList());
        System.out.println(collect2);

        list.forEach(System.out::println);

        List<Integer> collect3 = list.stream().map(a -> a * 3).collect(Collectors.toList());
        System.out.println(collect3);
    }
}
