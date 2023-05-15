package wyklady.w03.ex01;

public
    class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Jan", 2654);
        Student s2 = new Student("Ola", 78932);

        MyList list = new MyList();
        list.add(s1);
        list.add(s2);

        list.show();
    }
}
