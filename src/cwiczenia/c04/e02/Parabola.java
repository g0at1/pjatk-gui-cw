package cwiczenia.c04.e02;

public
    class Parabola
    implements FunDD {

    private double a;
    private double b;
    private double c;


    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double fun(double x) {
        return a * x * x + b * x + c;
    }
}
