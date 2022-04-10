package com.asish.interview;

import java.util.Arrays;
import java.util.List;

/**
 * input [2, 4, 6 ,9, 3, 3 ,4]
 * K = 3
 */
public class ArrayContiguousSubSetOfMax {


    public static void main(String args[]) {
         final Integer[] input = {2, 1, 1 ,1,3,3};
         final Integer k =3;
        System.out.println(contiguousSubSetOfMax(input, 3, 0, input.length));
    }

    private static Integer contiguousSubSetOfMax(Integer[] input, Integer k, Integer max, Integer length) {
        if(length>=k) {
            List<Integer>  subSet = Arrays.asList(input).subList(length-k, length);
            Integer sum = subSet.stream().reduce(0, (i, j) -> i+j);
            if(max<sum) {
                max =sum;
            }
           return contiguousSubSetOfMax(input, k, max, --length);
        } else {
            return max;
        }
    }

}

