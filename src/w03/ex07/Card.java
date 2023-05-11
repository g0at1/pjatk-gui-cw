package w03.ex07;

public
    enum Card {

    TWO(2), KING(11), ACE(12);

    private int value;

    private Card(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}
