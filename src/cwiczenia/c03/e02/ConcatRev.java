package cwiczenia.c03.e02;

public
    class ConcatRev
    implements TwoStringsOper {


    @Override
    public String apply(String str1, String str2) {
        return str2 + str1;
    }
}
