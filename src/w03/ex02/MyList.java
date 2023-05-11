package w03.ex02;

public
    class MyList<T> {

    private MyElement<T> head;

    public void add(T student){
        MyElement<T> element = new MyElement<T>(student);

        element.setNext(this.head);
        this.head = element;
    }

    public void show(){
        MyElement<T> tmp = this.head;
        while(tmp != null){
            System.out.println(tmp.getStudent());
            tmp = tmp.getNext();
        }
    }

}
