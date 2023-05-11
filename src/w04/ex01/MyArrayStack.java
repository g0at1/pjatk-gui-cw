package w04.ex01;

import java.util.Iterator;

public
    class MyArrayStack<T>
    extends MyArray<T>
    implements MyStack<T>, Iterable<T> {

    private int lastIndex;

    public MyArrayStack(){
        lastIndex = 0;
    }

    @Override
    public void push(T element) {
        data[lastIndex++] = element;
    }

    @Override
    public T pop() {
        return (T) data[--lastIndex];
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayStackIterator();
    }

    private class MyArrayStackIterator
        implements Iterator<T> {

        private int index = lastIndex;

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            return (T) data[--index];
        }
    }
}
