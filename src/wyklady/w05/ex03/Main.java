package wyklady.w05.ex03;

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
//            .sorted()
            .sorted(
                (s1, s2) -> s1.charAt(s1.length()-1) - s2.charAt(s2.length()-1)
            )
            .forEach(System.out::println);
    }
}
