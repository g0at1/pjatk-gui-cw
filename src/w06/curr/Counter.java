package w06.curr;

public
    class Counter {

    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public synchronized void inc(int id){
        this.counter++;
        System.out.println(id);
    }

    public int getCounter() {
        return counter;
    }
}
