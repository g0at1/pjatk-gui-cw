package w06.ex04;

public
    class Counter {

    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public synchronized void inc(){
        this.counter++;
    }

    public int getCounter() {
        return counter;
    }
}
