package w03.ex06;

import java.util.Comparator;

public
    class SelectableComparater
    implements Comparator<Student> {

    SortMode mode;

    public SelectableComparater(SortMode mode){
        this.mode = mode;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return switch (this.mode){
            case NAME -> o1.getName().compareTo(o2.getName());
            case INDEX -> o1.getIndexNumber() - o2.getIndexNumber();
        };
    }
}
