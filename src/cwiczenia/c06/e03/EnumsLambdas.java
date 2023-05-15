package cwiczenia.c06.e03;

import java.util.Arrays;
import java.util.Comparator;

public
    class EnumsLambdas {

    public static <T> void printArray(String title, T[] arr) {
        System.out.println("    ***" + title + "***");
        for (T val : arr) {
            System.out.println(val);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Person[] persons = {
                new Person("Max",  Sex.M, Size.XL, Country.NL),
                new Person("Jan",  Sex.M, Size.S,  Country.PL),
                new Person("Eva",  Sex.F, Size.XS, Country.NL),
                new Person("Lina", Sex.F, Size.L,  Country.DE),
                new Person("Mila", Sex.F, Size.S,  Country.DE),
                new Person("Ola",  Sex.F, Size.M,  Country.PL),
        };

        Comparator<Person> sexThenSize = (p1, p2) -> {
            int sexComp = p1.getSex().compareTo(p2.getSex());
            if (sexComp != 0) {
                return sexComp;
            }
            return p1.getSize().compareTo(p2.getSize());
        };
        Arrays.sort(persons, sexThenSize);
        printArray("Persons by sex and then size", persons);

        Arrays.sort(persons, (p1, p2) -> {
            int sizeComp = p1.getSize().compareTo(p2.getSize());
            if (sizeComp != 0) {
                return sizeComp;
            }
            return p1.getName().compareTo(p2.getName());
        });
        printArray("Persons by size and then name", persons);

        Country[] countries = Country.values();
        Arrays.sort(countries, (c1, c2) ->
                c1.name().compareTo(c2.name())
        );
        printArray("Countries by name", countries);
    }
}

