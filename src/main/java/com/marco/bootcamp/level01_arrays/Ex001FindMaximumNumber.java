
package com.marco.bootcamp.level01_arrays;

/**
 * ==========================================
 * Bootcamp Java Engineer
 * Level 01 - Arrays
 * Task 001 - Max Number
 *
 * Goal:
 * Find the maximum number in an array.
 *
 * Topics:
 * - Arrays
 * - For Loop
 * - Accumulator
 *
 * Complexity:
 *  Time: O(n)
 *  Space: O(1)
 * ==========================================
 */

public class Ex001FindMaximumNumber {

    public static void main(String[] args) {
         int[] n = {4, 9, 2, 15, 7, 9};

        int maxNumber = maxNumber(n);
        System.out.println("The highest element is: " + maxNumber);
    }
    
    public static int maxNumber(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }

        }
        return max;
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
 * Find the highest number in an array
 *
 * What I Learned:
 * - How to accumulate the first number in an array and compare them to find the highest number
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
