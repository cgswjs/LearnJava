package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    //map is like dictionary in python, map is mutable
    public static void main(String[] args) {

        Map<String, String> map =  new HashMap();
        map.put("Founder","Ian");
        map.put("Ceo","Jiani");
        map.put("Manager","Rainbow");
        map.put("Worker","Caesar");

        System.out.println(map);
        //use get in map to get the value corresponds to the input key
        System.out.println(map.get("Ceo"));

        Set<String> keys = map.keySet();
        //use for loop to get all values
        for(String key : keys){
            System.out.println(key + " "+map.get(key));
        }
    }
}
