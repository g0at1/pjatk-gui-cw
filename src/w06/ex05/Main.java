package w06.ex05;

public
    class Main {

    public static void main(String[] args) {
        final Object res1 = new Object();
        final Object res2 = new Object();


        Thread t1 = new Thread(
            ()->{
                synchronized (res1) {
                    System.out.println("res1 control in thread 1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    synchronized (res2) {
                        System.out.println("res2 control in thread 1");
                    }
                }
            }
        );

        Thread t2 = new Thread(
                ()->{
                    synchronized (res1) {
                        System.out.println("res1 control in thread 2");

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        synchronized (res2) {
                            System.out.println("res2 control in thread 2");
                        }
                    }
                }
        );

        t1.start();
        t2.start();


    }
}
