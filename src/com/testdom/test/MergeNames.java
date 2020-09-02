package com.testdom.test;

import java.util.*;

/**
 * Created by dineshs on 6/5/2019.
 */

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {

        Set<String> uniqueNamesSet = new HashSet<String>();
        String[] uniqueNameArr;

        for (String name : names1) {
            uniqueNamesSet.add(name);
        }

        for (String name : names2) {
            uniqueNamesSet.add(name);
        }

        uniqueNameArr = uniqueNamesSet.toArray(new String[uniqueNamesSet.size()]);
        return uniqueNameArr;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}