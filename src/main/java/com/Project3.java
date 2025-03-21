package com;

import java.util.Iterator;

public class Project3 {
    public static void main(String[] args){

        System.out.println("Hello World");

        Bag<String> myBag = new Bag<>();

        System.out.println("Size of my bag: " + myBag.size());
        System.out.println("Is my bag empty?: " +myBag.isEmpty());

        myBag.add("Apple");
        myBag.add("Orange");
        myBag.add("Banana");
        myBag.add("Tangerine");
        myBag.add("Peach");


        System.out.println("Size of my bag: " + myBag.size());
        System.out.println("Is my bag empty?: " + myBag.isEmpty());
        System.out.println(myBag.size());

        myBag.forEach(e -> System.out.println(e));

        Iterator<String>iter = myBag.iterator();

        System.out.printf("\n\nNew Iterator");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.printf("\n\nSpliterator");
        myBag.spliterator().forEachRemaining(e -> System.out.println(e));
    }
}
