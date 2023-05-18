package cwiczenia.c09.e02;

import java.util.Random;

public
    class WorkerThread
    extends Thread {

    private char letter;
    private boolean running;
    private boolean suspended;

    public WorkerThread(char letter) {
        this.letter = letter;
        this.running = true;
        this.suspended = false;
    }

    public void stopThread() {
        this.running = false;
    }

    public void suspendThread() {
        this.suspended = true;
    }

    public void resumeThread() {
        this.suspended = false;
        synchronized (this) {
            notify();
        }
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (running) {
            System.out.print(letter);
            try {
                Thread.sleep(random.nextInt(901) + 100);
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\nThread " + getLetter() + " exits");
    }
}
