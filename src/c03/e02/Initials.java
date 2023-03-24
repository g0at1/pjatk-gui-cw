package c03.e02;

public
    class Initials
    implements TwoStringsOper {


    @Override
    public String apply(String str1, String str2) {
        return String.valueOf(str1.charAt(0)) + String.valueOf(str2.charAt(0));
    }
}
