package w04.ex02;

import java.util.stream.Stream;

public
    class Main {

    public static void main(String[] args) {
        Stream.generate(Math::random)
            .limit(10)
            .forEach(System.out::println);

        Stream.iterate( 1, el -> el+2)
            .limit(20)
            .forEach(System.out::println);

        Stream.iterate( 1, el -> el + 1)
            .takeWhile(el -> el < 10)
            .dropWhile(el -> el <  5)
            .forEach(System.out::println);
    }
}
