package es.rachelcarmena.oo.abusers.smell1;

import java.util.Vector;

public class CoolStack extends Vector {

    public void push(Object element) {
        insertElementAt(element, 0);
    }

    public Object pop() {
        Object result = firstElement();
        removeElementAt(0);
        return result;
    }
}
