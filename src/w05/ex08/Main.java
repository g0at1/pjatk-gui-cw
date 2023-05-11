package w05.ex08;

public
    class Main {

    public static void main(String[] args) {
        new Runner("Thread1").start();
        new Runner("Thread2").start();
    }
}
