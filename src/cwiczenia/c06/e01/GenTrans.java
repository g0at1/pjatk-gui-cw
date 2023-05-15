package cwiczenia.c06.e01;

import java.util.Arrays;

public
    class GenTrans {

    private static<T, R>
    void transform(T[] in, R[] out, Transform<T, R> trans) {
        for (int i = 0; i < in.length; i++) {
            out[i] = trans.apply(in[i]);
        }
    }

    public static void main(String[] args) {
        String[]  sin = {"Alice", "Sue", "Janet", "Bea"};
        System.out.println(Arrays.toString(sin) + '\n');

        Transform<String, Integer> t1 = new StrToInt();
        Integer[] iout = new Integer[sin.length];
        transform(sin, iout, t1);
        System.out.println(Arrays.toString(iout));

        Transform<String, Character> t2 = new Transform<String, Character>() {
            @Override
            public Character apply(String s) {
                return s.charAt(0);
            }
        };
        Character[] cout = new Character[sin.length];
        transform(sin, cout, t2);
        System.out.println(Arrays.toString(cout));

        Transform<String, String> t3 = s -> s.toUpperCase();
        String[] sout = new String[sin.length];
        transform(sin, sout, t3);
        System.out.println(Arrays.toString(sout));
    }
}
