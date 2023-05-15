package cwiczenia.c05.e01;

public
    class MyColor
    extends java.awt.Color
    implements Comparable<MyColor>{

    private int sum;


    public MyColor(int r, int g, int b) {
        super(r, g, b);
        this.sum = r + g + b;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "(" + getRed() + "," + getGreen() + "," + getBlue() + ")";
    }

    @Override
    public int compareTo(MyColor o) {
        return this.getSum() - o.getSum();
    }
}
