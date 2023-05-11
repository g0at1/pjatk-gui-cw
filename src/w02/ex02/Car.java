package w02.ex02;

public
    class Car
    implements Vechicle {

    private int distance;

    public Car(){
        this.distance = 0;
    }

    @Override
    public void startEngine() {
        if(engineCheckTime(this.distance)){
            System.out.println("SERVICE");
        }
    }

    @Override
    public void move() {
        this.distance++;
    }
}
