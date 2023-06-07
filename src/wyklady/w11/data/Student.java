package wyklady.w11.data;

import wyklady.w08.curr.event.StudentEvent;
import wyklady.w08.curr.event.StudentListener;

import java.util.ArrayList;
import java.util.List;

public
    class Student {

    private String name;
    private int indexNumber;

    public Student(String name, int indexNumber) {
        this.name = name;
        this.indexNumber = indexNumber;

        studentListeners = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
        this.fireStudentUpdated();
    }

    @Override
    public String toString() {
        return this.name+"("+this.indexNumber+")";
    }

    private List<StudentListener> studentListeners;

    public void addStudentListener(StudentListener sl){
        this.studentListeners.add(sl);
    }

    public void removeStudentListener(StudentListener sl){
        this.studentListeners.remove(sl);
    }

    private void fireStudentUpdated(){
        for(StudentListener sl : studentListeners)
            sl.indexChanged(
                new StudentEvent(this)
            );
    }
}
