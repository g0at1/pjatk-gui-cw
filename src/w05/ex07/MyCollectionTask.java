package w05.ex07;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;

public
    class MyCollectionTask {

    private List<MyItem> myItemList = new LinkedList<>();
    private Integer x, y;

    public void accept(Integer i){
        this.x = this.y;
        this.y = i;
        if( this.x != null){
            myItemList.add(
                new MyItem( this.x, this.y)
            );
            this.x = null;
            this.y = null;
        }
    }

    public MyCollectionTask combine(MyCollectionTask o){
        throw new UnsupportedOperationException();
    }

    public List<MyItem> finish() {
        return myItemList;
    }

    public static Collector<Integer, ?, List<MyItem>> collector(){
        return Collector.of(
            MyCollectionTask::new,
            MyCollectionTask::accept,
            MyCollectionTask::combine,
            MyCollectionTask::finish
        );
    }
}
