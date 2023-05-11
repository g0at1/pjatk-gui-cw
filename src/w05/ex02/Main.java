package w05.ex02;

import java.util.stream.Stream;

public
    class Main {

    public static void main(String[] args) {
        Stream<String> namesStream = Stream.of(
            "John", "Marry", "Olga", "Jan", "Anna", "Alice"
        );

        namesStream
            //.filter( e -> e.startsWith("A"))
            .filter( s -> s.indexOf("a") != -1 )
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
