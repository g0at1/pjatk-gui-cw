package wyklady.w03.ex02;

public
    class MyElement<T> {

    private T student;
    private MyElement<T> next;

    public MyElement(T student) {
        this.student = student;
        this.next = null;
    }

    public T getStudent() {
        return student;
    }

    public MyElement<T> getNext() {
        return next;
    }

    public void setNext(MyElement<T> next) {
        this.next = next;
    }
}
