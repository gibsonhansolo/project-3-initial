package com;

import com.example.iterable.Container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;


/**
 * Extend inherits properties from Container.
 * It is a is-a relationship. Child is special version of Parent

  Implements means class, agrees to provide implementation for all methods in the interface.
  It is a "can-do" and fulfills a contract.

 */
public class Bag<T> implements Container<T> {
    private List<T> items ;

    public Bag(){
        this.items = new ArrayList<>();
    }

    public boolean isEmpty(){
        return this.items.isEmpty();
    }

    public int size(){
        return this.items.size();
    }

    @Override
    public void add(T item) {
        this.items.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return this.items.iterator();
    }

    @Override
    //                          ? wild card, any T or any superType of T
    //So Consumer<? super T> action means a Consumer that can accept arguments of
    public void forEach(Consumer<? super T> action) {
        //Container is the parent class
        //super is used to access parent class properties
        //forEach is a method in Container
        //action is a parameter
        Container.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        //super is used to access parent class properties
        return Container.super.spliterator();
    }
}