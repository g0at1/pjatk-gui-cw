package c06.e03;

public
    enum Sex {

    F("Female"), M("Male");

    private String value;

    Sex(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }


}


