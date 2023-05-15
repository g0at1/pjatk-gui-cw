package wyklady.w05.ex04;

import java.util.Arrays;
import java.util.List;

public
    class Main {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList(
            "a1", "a2", "b3", "b4", "c5", "c6"
        );

        strList
            .stream()
            .map(s -> s.substring(1))
            .mapToInt(Integer::parseInt)
            .forEach(System.out::println);


    }
}
