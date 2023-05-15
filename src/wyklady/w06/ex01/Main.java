package wyklady.w06.ex01;

public
    class Main {

    public static void main(String[] args) {
        MyTread myTread1 = new MyTread(1);
        MyTread myTread2 = new MyTread(2);

        myTread1.start();
        myTread2.start();
    }
}
