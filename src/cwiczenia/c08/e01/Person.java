package cwiczenia.c08.e01;

import java.util.Collection;
import java.util.Objects;

public
    class Person
    implements Comparable<Person> {

    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public static boolean isInColl(
            Collection<Person> coll, String name, int year) {

        return coll.contains(new Person(name, year));
    }

    @Override
    public int compareTo(Person o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = Integer.compare(this.birthYear, o.birthYear);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }
}
