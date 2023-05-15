package wyklady.w05.ex05;

import java.util.LinkedList;
import java.util.List;

public
    class Main {

    public static void main(String[] args) {
        List<MyItem> myItemList = new LinkedList<>();
        for(int i=0; i<5; i++){
            MyItem myItem = new MyItem(
                (int)(Math.random()*99),
                (int)(Math.random()*99)
            );
            myItemList.add(myItem);
            System.out.println(myItem);
        }

        System.out.println("==============");

        myItemList
                .stream()
                .forEach(System.out::println);
    }
}
