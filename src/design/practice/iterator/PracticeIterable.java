package design.practice.iterator;

import design.Iterator;

public interface PracticeIterable<E> {

    public abstract PracticeIterator<E> iterator();
}
