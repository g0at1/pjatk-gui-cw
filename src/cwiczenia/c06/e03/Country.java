package cwiczenia.c06.e03;

public
    enum Country {

    PL("Polska"), NL("Nederland"), DE("Deutschland");

    private String value;

    Country(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
