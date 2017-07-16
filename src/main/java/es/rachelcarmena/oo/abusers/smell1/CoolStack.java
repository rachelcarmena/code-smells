package es.rachelcarmena.oo.abusers.smell1;

import java.util.Vector;

public class CoolStack {

    private final Vector vector = new Vector();

    public void push(Object element) {
        vector.insertElementAt(element, 0);
    }

    public Object pop() {
        Object result = vector.firstElement();
        vector.removeElementAt(0);
        return result;
    }

    public int size() {
        return vector.size();
    }

    public boolean isEmpty() {
        return vector.isEmpty();
    }
}
