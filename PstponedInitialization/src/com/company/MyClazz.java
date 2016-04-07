package com.company;

/**
 * Created by psok on 2/19/2016.
 */
public class MyClazz {
    private NestedClass nestedClass;

    public NestedClass getNestedClass() {
        if (nestedClass == null) {
            nestedClass = new NestedClass();
        }
        return nestedClass;
    }
}
