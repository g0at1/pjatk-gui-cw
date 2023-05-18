package cwiczenia.c09.e02;

public
    class Main {

    public static void main(String[] args) {
        int numThreads = 5;

        WorkerThread[] threads = new WorkerThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            char letter = (char) ('a' + i);
            threads[i] = new WorkerThread(letter);
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].start();
        }

        int cycles = 0;
        int currentThreadIndex = 0;

        try {
            while (cycles < 10) {
                Thread.sleep(5000);
                System.out.print("\nResuming " + threads[currentThreadIndex].getLetter() +
                        ", suspending " + threads[(currentThreadIndex + 1) % numThreads].getLetter() + ": ");
                threads[currentThreadIndex].resumeThread();
                threads[(currentThreadIndex + 1) % numThreads].suspendThread();
                currentThreadIndex = (currentThreadIndex + 1) % numThreads;
                cycles++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].stopThread();
        }

        try {
            for (int i = 0; i < numThreads; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
