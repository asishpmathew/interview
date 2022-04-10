package com.asish.interview;

/**
 * When the list is sorted we can use the binary search (also known as half-interval search, logarithmic search, or binary chop) technique to find items on the list. Here's a step-by-step description of using binary search:
 * 1. Let min = 1 and max = n.
 * 2. Guess the average of max and min rounded down so that it is an integer.
 * If you guessed the number, stop. You found it!
 * If the guess was too low, set min to be one larger than the guess.
 * If the guess was too high, set max to be one smaller than the guess.
 * Go back to step two.
 */
public class BinarySearch {

    public static void main(String args[]) {
        Integer[] input ={1, 3, 5, 10, 34, 45};
        Integer searchItem = 3;
        System.out.println(binarySearchCustom(input, searchItem, 0 , input.length-1));
    }

    private static Integer binarySearchCustom( Integer[] input, Integer searchItem, Integer min, Integer max) {
        if(min<=max) {
            Integer middle = (max+min)/2;
            if(input[middle] == searchItem) {
                return middle;
            } else if(input[middle] <= searchItem) {
                min = middle+1;
                return binarySearchCustom(input, searchItem, min, max);
            } else {
                max = middle -1;
                return binarySearchCustom(input, searchItem, min, max);
            }
        } else {
            return -1;
        }
    }
}
