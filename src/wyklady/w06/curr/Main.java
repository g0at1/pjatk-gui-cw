package wyklady.w06.curr;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public
    class Main {

    public static void main(String[] args) {
        final Lock lock = new ReentrantLock(true);

        Thread t1 = new Thread(
            () -> {
                System.out.println("Thread 1 working ...");
                lock.lock();
                try {
                    while (true) {
                        System.out.println("Thread 1 running");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }finally {
                    lock.unlock();
                }
            }
        );
        Thread t2 = new Thread(
            () -> {
                System.out.println("Thread 2 working ...");
                lock.lock();
                try {
                    while (true) {
                        System.out.println("Thread 2 running");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }finally {
                    lock.unlock();
                }
            }
        );

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
