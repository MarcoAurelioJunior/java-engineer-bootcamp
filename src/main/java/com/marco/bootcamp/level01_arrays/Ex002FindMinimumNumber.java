package com.marco.bootcamp.level01_arrays;

/**
 * ==========================================
 * Java Engineer Bootcamp
 * Level 01 - Arrays
 *
 * Exercise 002
 * Find Minimum Number
 *
 * Time: O(n)
 * Space: O(1)
 * ==========================================
 */

public class Ex002FindMinimumNumber {
     public static void main(String[] args) {
         int[] numbers= {4, 9, 2, 15, 7, 9};

        int minNumber = findMinimumNumber(numbers);
        System.out.println("The minimum element is: " + minNumber);
    }
     
     public static int findMinimumNumber(int[] numbers) {
         int min = numbers[0];
         
         for(int i = 1; i < numbers.length; i++) {
             if (min > numbers[i]) {
                 min = numbers[i];
             } 
         }
         
         return min;
     }
}

/*
* -----------------------------------------------------------
 * LEARNING NOTES
 * -----------------------------------------------------------
 *
 * Difficulty:
 * ☆
 *
 * Solved Alone:
 * Yes
 *
 * Needed Hints:
 * No
 *
 * Pattern Learned:
 * Accumulator
 *
 * Key Idea:
 * Find the smallest number in an array
 *
 * What I Learned:
 * - How to accumulate the first number in an array and compare them to find the smallest number
 *
 * Biggest Difficulty:
 * - None
 *
 * Possible Improvements:
 * - None
 *
 * Date:
 * 2026-06-29
 * ===========================================================
 */
