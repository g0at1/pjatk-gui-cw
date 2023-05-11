package w02.ex01;

public
    class Computer {
    public void connect(USB usb) {
        // check comm
        usb.send(new byte[]{1});
        // getData
        String data = usb.receive();
        System.out.println("Device id: "+data);
    }
}
