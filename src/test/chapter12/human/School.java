package test.chapter12.human;

import java.util.ArrayList;

public class School<T> {

    ArrayList<T> list = new ArrayList<T>();

    void add(T input) {
        list.add(input);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
