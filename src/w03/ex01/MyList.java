package w03.ex01;

public
    class MyList {

    private MyElement head;

    public void add(Student student){
        MyElement element = new MyElement(student);

        element.setNext(this.head);
        this.head = element;
    }

    public void show(){
        MyElement tmp = this.head;
        while(tmp != null){
            System.out.println(tmp.getStudent());
            tmp = tmp.getNext();
        }
    }

}
