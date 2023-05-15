package wyklady.w03.ex05;

public
    class Student{

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

}
