package w03.ex02;

public
    class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Jan", 2654);
        Student s2 = new Student("Ola", 78932);

        MyList<Student> list = new MyList<Student>();
        list.add(s1);
        list.add(s2);
        //list.add(new Object());

        list.show();
    }
}
