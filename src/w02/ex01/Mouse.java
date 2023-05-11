package w02.ex01;

public
    class Mouse
    implements USB {

    @Override
    public void send(byte[] bytes) {
        System.out.println("Connected");
    }

    @Override
    public String receive() {
        return "mouse";
    }
}
