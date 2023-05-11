package w04.ex01;

public
    class MyArrayQueue<T>
    extends MyArray<T>
    implements MyQueue<T>{

    private int lastIndex;

    public MyArrayQueue() {
        this.lastIndex = 0;
    }

    @Override
    public void add(T element) {
        data[lastIndex++] = element;
    }

    @Override
    public T get() {
        Object obj = data[0];
        --lastIndex;
        for(int i=0; i<lastIndex; i++)
            data[i] = data[i+1];

        return (T) obj;
    }
}
