package wyklady.w04.ex01;

import java.util.Iterator;

public
    class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Jan", 1701);
        Student s2 = new Student("Ola", 27866);
        Student s3 = new Student("Tomasz", 534);

        MyArrayStack<Student> myStack = new MyArrayStack<>();

        myStack.push(s1);
        myStack.push(s2);
        myStack.push(s3);

//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());

        System.out.println("===============================================");

        MyArrayQueue<Student> myQueue = new MyArrayQueue<>();
        myQueue.add(s1);
        myQueue.add(s2);
        myQueue.add(s3);

//        System.out.println(myQueue.get());
//        System.out.println(myQueue.get());
//        System.out.println(myQueue.get());

        System.out.println("===============================================");

        Iterator<Student> iterator =  myStack.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

        for(Iterator<Student> iter = myStack.iterator(); iter.hasNext();)
            System.out.println(iter.next());

        for(Student s : myStack)
            System.out.println(s);

/*        for(Student s : myQueue)
            System.out.println(s);*/


    }
}
