package w02.ex02;

public
    interface Vechicle {

    void startEngine();
    void move();

    default boolean engineCheckTime(int km){
        return km >= 10000;
    }
}
