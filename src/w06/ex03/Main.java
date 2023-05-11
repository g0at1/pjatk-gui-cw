package w06.ex03;

public
    class Main {

    public static void main(String[] args) {
        MyTread myTread1 = new MyTread(1);
        MyTread myTread2 = new MyTread(2);

        myTread1.start();
        myTread2.start();

        while(true) {
            try {
                Thread.sleep(1000);
                System.out.println();
                synchronized (Thread.currentThread()) {
                    Thread.currentThread().notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
