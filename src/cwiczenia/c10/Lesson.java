package cwiczenia.c10;

public
    class Lesson {
    private String subject;
    private String classroom;
    private String teacher;
    private String dayOfWeek;
    private int blockNumber;

    public Lesson(String subject, String classroom, String teacher, String dayOfWeek, int blockNumber) {
        this.subject = subject;
        this.classroom = classroom;
        this.teacher = teacher;
        this.dayOfWeek = dayOfWeek;
        this.blockNumber = blockNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }
}