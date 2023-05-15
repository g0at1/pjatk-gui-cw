package wyklady.w06.ex02;

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
                synchronized (myTread1) {
                    myTread1.notify();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
