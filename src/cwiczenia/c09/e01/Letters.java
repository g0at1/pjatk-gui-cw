package cwiczenia.c09.e01;

import java.util.Iterator;

public
    class Letters
    implements Runnable, Iterable<Thread> {

    private String letters;
    private Thread[] threads;

    public Letters(String letters) {
        this.letters = letters;
        this.threads = new Thread[letters.length()];
    }

    public void start() {
        for (int i = 0; i < letters.length(); i++) {
            Thread thread = new Thread(this);
            threads[i] = thread;
            thread.setName("Thread " + letters.charAt(i));
            thread.start();
        }
    }

    public void stop() {
        for (Thread thread : threads) {
            if (thread != null && thread.isAlive()) {
                thread.interrupt();
            }
        }
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.print(Thread.currentThread().getName().charAt(7));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public Iterator<Thread> iterator() {
        return new LettersIterator();
    }

    private class LettersIterator implements Iterator<Thread> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < threads.length && threads[index] != null;
        }

        @Override
        public Thread next() {
            return threads[index++];
        }
    }
}
