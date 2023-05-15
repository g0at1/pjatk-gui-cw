package wyklady.w08.ex03;

import java.util.EventObject;

public
    class StudentEvent
    extends EventObject {

    public StudentEvent(Object source) {
        super(source);
    }
}
