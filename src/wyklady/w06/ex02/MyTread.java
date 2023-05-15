package wyklady.w06.ex02;

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
            for (int i = 1; i < 100; i++) {
                synchronized (this){
                    if(i%10 == 0) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                System.out.print(this.threadId);
            }
    }
}
