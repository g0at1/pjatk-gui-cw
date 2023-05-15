package wyklady.w06.ex01;

public
    class MyTread
    extends Thread {

    private int threadId;
    private final static Object obj = new Object();

    public MyTread(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++)
            synchronized (obj) {
                System.out.println(this.threadId);
            }
    }
}
