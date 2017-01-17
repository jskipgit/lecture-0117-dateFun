package com.ironyard.example;

import com.ironyard.data.InfoHolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by jasonskipper on 1/17/17.
 */
public class DataStructures {
    public static void main(String[] args){
        // HASH STUFF
        HashMap<String, String> tmpData = new HashMap<String, String>();

        tmpData.put("key0", "jason");
        tmpData.put("key1", "1");
        tmpData.put("key2", "2");
        tmpData.put("key3", "3");

        Iterator<String> itr = tmpData.keySet().iterator();

        while(itr.hasNext()){
            String key = itr.next();
            System.out.printf("Key: %s, Value: %s \n", key, tmpData.get(key));

        }



        // ARRAY LIST STUFF
        ArrayList<String> tmpList = new ArrayList<String>();
        tmpList.add("hello");
        tmpList.add("jason");
        tmpList.add("how");
        tmpList.add("are");
        tmpList.add("you");

        for(int i=0; i<tmpList.size(); i++) {

            System.out.println(tmpList.get(i));
        }
    }
}
