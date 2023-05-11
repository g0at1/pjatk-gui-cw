package w05.ex08;

public
    class Runner
    extends Thread{

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
