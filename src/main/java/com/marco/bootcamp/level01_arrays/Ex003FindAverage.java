
package com.marco.bootcamp.level01_arrays;

/**
 * ==========================================
 * Java Engineer Bootcamp
 * Level 01 - Arrays
 *
 * Exercise 003
 * Find The Average Number
 *
 * Time: O(n)
 * Space: O(1)
 * ==========================================
 */

public class Ex003FindAverage {
      public static void main(String[] args) {
         double[] numbers= {4, 9, 2, 15, 7, 9};

        double averageResult = findAverage(numbers);
        System.out.println("The avarage is: " + averageResult);
    }
      
      public static double findAverage(double[] numbers) {
          double average = numbers[0];
          
          for(int i = 1; i < numbers.length; i++) {
              average += numbers[i];
         }
          
         return average / numbers.length;
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
 * Find the average number in an array of double
 *
 * What I Learned:
 * - How to calculate the average
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
