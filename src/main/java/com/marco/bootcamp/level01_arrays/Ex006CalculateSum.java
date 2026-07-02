
package com.marco.bootcamp.level01_arrays;

/**
 * ==========================================
 * Java Engineer Bootcamp
 * Level 01 - Arrays
 *
 * Exercise 003
 * Find Even numbers
 *
 * Time: O(n)
 * Space: O(1)
 * ==========================================
 */

public class Ex006CalculateSum {
      public static void main(String[] args) {
         int[] numbers= {4, 9, 2, 15, 7, 9};

        int sum = calculateSum(numbers);
        System.out.println("The total sum of array is: " + sum);
    }
      
    public static int calculateSum(int[] numbers) {
        int result = numbers[0];
        
        for(int i = 1; i < numbers.length; i++) {
            result += numbers[i];
        }
        
        return result;
    }
          
          
}


/*
* -----------------------------------------------------------
 * LEARNING NOTES
 * -----------------------------------------------------------
 *
*
 * ===========================================================
 */
