/*
 * DynArray.java
 *
 * Created on 9. November 2008, 23:27
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 3.0.3
 *
 */

@Deprecated /** Use ArrayList<T> instead */
public class DynArray<T> {

    private final int capacity;
    private final T[] element;

    private int start = -1;                                                                                             // erster  belegter Index
    private int end   = -1;                                                                                             // letzter belegter Index

    public DynArray(T[] element) {
        capacity = element.length;
        this.element = element;
    }

    public boolean add(T element) {
        boolean value = false;
        if (start < 0) {
            ++start;
            value = true;
        } else if (end == capacity) {
            value = reinit();
        }
        if (value) {
            ++end;
            this.element[end] = element;
        }
        return value;
    }

    public void removeFirst() {
        element[start] = null;
        ++start;
    }

    public void removeLast() {
        element[end] = null;
        --end;
    }

    public void remove(int index) {
        for (int i = index; i <= end-1; ++i) {
            element[i] = element[i+1];
        }
        removeLast();
    }

    private boolean reinit() {
        if ( getLength() >= capacity ) {
            return false;
        }
        int i = 0;
        for (; i < getLength(); ++i) {
            element[i] = element[start+i];
        }
        start = 0;
        end   = i;
        // Nullen aller übrigen Positionen
        for (++i; i < capacity; ++i) {
            element[i] = null;
        }
        return true;
    }

    public T getT(int index) {
        return element[index];
    }

    public int getLength() {
        // Anzahl der initiallisierten Elemente
        return end - start;
    }

}
