package w02.ex01;

public
    class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();

        computer.connect(mouse);
    }
}
