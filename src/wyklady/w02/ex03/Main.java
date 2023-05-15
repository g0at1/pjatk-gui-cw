package wyklady.w02.ex03;

public
    class Main
    implements A, B{

    public static void main(String[] args) {

    }

    @Override
    public void xxx() {
        A.super.xxx();
        B.super.xxx();
    }
}
