
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

public class Ex01_MaxNumber {

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
