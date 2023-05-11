package w05.ex07;

import java.util.List;
import java.util.stream.Stream;

public
    class Main {

    public static void main(String[] args) {
        List<MyItem> myList = Stream.generate(Math::random)
            .limit(10)
            .map( e -> (int)(e.doubleValue()*99))
            .collect(MyCollectionTask.collector());


        System.out.println("==============");

        myList
            .stream()
            .forEach(System.out::println);
    }
}
