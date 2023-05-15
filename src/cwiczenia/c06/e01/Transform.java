package cwiczenia.c06.e01;

@FunctionalInterface
public
    interface Transform<T, R> {

    R apply(T s);
}
