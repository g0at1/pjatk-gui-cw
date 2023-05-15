package wyklady.w03.ex05;

import java.util.Comparator;

public
    class SelectableComparater
    implements Comparator<Student> {

    static final String nameMode = "NAME";
    static final String indexMode = "INDEX";

    String mode;

    public SelectableComparater(String mode){
        this.mode = mode;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return switch (this.mode){
            case nameMode -> o1.getName().compareTo(o2.getName());
            case indexMode -> o1.getIndexNumber() - o2.getIndexNumber();
            default -> 0;
        };
    }
}
