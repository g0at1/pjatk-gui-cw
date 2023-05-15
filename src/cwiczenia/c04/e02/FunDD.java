package cwiczenia.c04.e02;

@FunctionalInterface
interface FunDD {
    double fun(double x);
    static double xminim(FunDD f, double a, double b) {
        double xMinim = a;
        double yMinim = f.fun(a);
        for (double x = a; x <= b; x += 1e-5) {
            double y = f.fun(x);
            if (y < yMinim) {
                yMinim = y;
                xMinim = x;
            }
        }
        return xMinim;
    }
}