package com.mary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingIntegers {
    public int solution(int[] A) {
       HashSet<Integer> nums = new HashSet<Integer>();
        for(int i = 1; i<=A.length+1; i++) {
            nums.add(i);
        }
        for (int a : A){
            nums.remove(new Integer(a));
        }
       return nums.iterator().next();


    }
    public static void main(String[] args) {
        MissingIntegers mi = new MissingIntegers();
        System.out.println(mi.solution(new int [] {-1,-2}));

    }
}
