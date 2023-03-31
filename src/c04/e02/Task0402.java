package c04.e02;

public
    class Task0402 {
    public static void main(String[] args) {


        Parabola p1 = new Parabola(1, -1, -5./4);
        double xminim1 = FunDD.xminim(p1, 0, 1);
        System.out.println(xminim1);

        FunDD f1 = new FunDD() {
            @Override
            public double fun(double x) {
                return Math.sqrt(Math.pow(x - 0.75, 2) + 1);
            }
        };
        double xminim2 = FunDD.xminim(f1, 0, 2);
        System.out.println(xminim2);


        double xminim3 = FunDD.xminim(x -> x * x * (x - 2), 0, 2);
        System.out.println(xminim3);
    }
}
