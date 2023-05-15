package wyklady.w03.ex03;

public
    class Student
    implements Comparable<Student>{

    private String name;
    private int indexNumber;

    public Student(String name, int indexNumber) {
        this.name = name;
        this.indexNumber = indexNumber;
    }

    public String getName() {
        return name;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    @Override
    public String toString() {
        return this.name+"("+this.indexNumber+")";
    }

    @Override
    public int compareTo(Student o) {
//        return this.indexNumber - o.indexNumber;
        return this.name.compareTo(o.name);
    }
}
