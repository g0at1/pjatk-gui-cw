package w05.ex07;

public
    class MyItem {

    private Integer x, y;

    public MyItem() {
    }

    public MyItem(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyItem("+x+","+y+")";
    }
}
