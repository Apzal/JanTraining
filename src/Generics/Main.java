package Generics;

import Abstraction.Chromium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
       List<Integer> list = new LinkedList<>();
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Iterator<Integer> iterator = list.iterator();

        System.out.println("Iterator");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }






    }
}
