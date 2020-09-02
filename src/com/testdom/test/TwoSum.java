package com.testdom.test;

import java.util.*;

/**
 * Created by dineshs on 6/5/2019.
 */

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {

        int[] indexSum = new int[2];
        boolean solutionFound = false;
        Set<Integer> notCalc = new HashSet<Integer>();

        for(int i=0; i < list.length; i++) {

            if(!notCalc.add(list[i])) {
                continue;
            }

            for(int j=i+1; j < list.length; j++ ) {
                if(list[i] + list[j] == sum) {
                    indexSum[0] = i;
                    indexSum[1] = j;
                    solutionFound = true;
                    break;
                }
            }

            if(solutionFound == true) {
                break;
            }
        }

        return solutionFound ? indexSum : null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
