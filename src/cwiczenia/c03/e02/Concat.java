package cwiczenia.c03.e02;

public
    class Concat
    implements TwoStringsOper {


    @Override
    public String apply(String str1, String str2) {
        return str1 + str2;
    }
}
