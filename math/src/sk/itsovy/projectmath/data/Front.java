package sk.itsovy.projectmath.data;

import sk.itsovy.projectmath.Dot;

public class Front extends Stack {

    private Dot array[];

    public Front(int capacity) {
        super(capacity);
        this.array= new Dot[capacity];

    }

}
