package Generics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set =new TreeSet<>();

        set.add(10);
        set.add(5);
        set.add(20);
        set.add(12);
        set.add(30);



        System.out.println(set);
    }
}
