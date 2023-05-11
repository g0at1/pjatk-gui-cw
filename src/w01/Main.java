package w01;

public
    class Main {

    public static void main(String[] args) {
        new A();
        //new B();
        new C();
    }

    public static char acc;
    public String str;

    public Main(){
        new B().fun(10);
        B b = new B();
        B.wrt = 15;

        //Main m = b;


    }

    public
        class B {

        static int wrt;

        public void fun(int w){
            System.out.println(w+" "+str);
            Main.acc = 10;
        }
    }

    public
        static class C{

    }
}

class A{

}
