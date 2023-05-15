package wyklady.w05.ex09;

public
    class Runner
    implements Runnable{

    private String id;

    public Runner(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++)
            System.out.println(id+": "+i);
    }
}
