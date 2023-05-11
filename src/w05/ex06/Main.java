package w05.ex06;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public
    class Main {

    public static void main(String[] args) {
        List<Integer> myList = Stream.generate(Math::random)
            .limit(10)
            .map( e -> (int)(e.doubleValue()*99))
            .collect(Collectors.toList());


        System.out.println("==============");

        myList
            .stream()
            .forEach(System.out::println);
    }
}
