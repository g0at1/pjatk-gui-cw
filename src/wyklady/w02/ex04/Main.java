package wyklady.w02.ex04;

public
    class Main {

    public static void main(String[] args) {
        sMet(new MyClass());
        sMet(new FunctionalInterface() {
            @Override
            public void method() {
                System.out.println("Anon::method()");
            }
        });
        sMet(
            () -> {
                System.out.println("Lambda::method()");
            }
        );
    }

    public static void sMet(FunctionalInterface fi){
        fi.method();
    }
}
