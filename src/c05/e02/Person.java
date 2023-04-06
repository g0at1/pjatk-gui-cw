package c05.e02;

public
    class Person
    implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age;
    }

    @Override
    public int compareTo(Person person) {
        if (person.getAge() > this.getAge()) {
            return -1;
        }
        else if (person.getAge() < this.getAge()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void sort(Person[] person) {
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - i - 1; j++) {
                if (person[j].compareTo(person[j + 1]) > 0) {
                    Person tmp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = tmp;
                }
            }
        }
    }
}
