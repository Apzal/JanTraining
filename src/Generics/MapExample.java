package Generics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("Name", "John");
        map.put("Class", "X");
        map.put("Grade", "A+");
        map.put("Mark", "A+");


        System.out.println(map);


        for(String key:map.keySet()){
            System.out.println(map.get(key));
        }

        for(Map.Entry<String,String> entry :map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }


    }
}
