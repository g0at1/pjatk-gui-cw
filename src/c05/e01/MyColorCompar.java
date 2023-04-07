package c05.e01;

import java.util.Comparator;

public
    class MyColorCompar
    implements Comparator<MyColor> {

    private ColComponent component;

    public MyColorCompar(ColComponent component) {
        this.component = component;
    }

    @Override
    public int compare(MyColor c1, MyColor c2) {
        return switch (this.component) {
            case RED -> c1.getRed() - c2.getRed();
            case GREEN -> c1.getGreen() - c2.getGreen();
            case BLUE -> c1.getBlue() - c2.getBlue();
            case NONE -> c1.compareTo(c2);
        };
    }
}
