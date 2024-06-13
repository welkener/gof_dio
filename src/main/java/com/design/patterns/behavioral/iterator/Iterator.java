package com.design.patterns.behavioral.iterator;


public interface Iterator {

    boolean hasNext();

    Object next();

    Object currentItem();
}
