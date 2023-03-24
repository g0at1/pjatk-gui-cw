package c03.e02;

public
    class Separ
    implements TwoStringsOper {

    private String str;
    public Separ(String str) {
        this.str = str;
    }


    @Override
    public String apply(String str1, String str2) {
        return str1 + str + str2;
    }
}
