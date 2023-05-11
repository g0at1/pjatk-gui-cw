package w03.ex01;

public
    class MyElement {

    private Student student;
    private MyElement next;

    public MyElement(Student student) {
        this.student = student;
        this.next = null;
    }

    public Student getStudent() {
        return student;
    }

    public MyElement getNext() {
        return next;
    }

    public void setNext(MyElement next) {
        this.next = next;
    }
}
