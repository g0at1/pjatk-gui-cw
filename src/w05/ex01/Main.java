package w05.ex01;

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
            .forEach(System.out::println);
    }
}
