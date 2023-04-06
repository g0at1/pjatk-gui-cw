package c05.e02;

public
    class Main {
    public static void main(String[] args) {

        Person[] people = new Person[] {
                new Person("Jan", 12),
                new Person("Marta", 52),
                new Person("Kuba", 21),
                new Person("Adam", 34),
                new Person("Magda", 5),
        };
        Person.sort(people);

        for (Person p : people) {
            System.out.println(p);
        }
    }
}
