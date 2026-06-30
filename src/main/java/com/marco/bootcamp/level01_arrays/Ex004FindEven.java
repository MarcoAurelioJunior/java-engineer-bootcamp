
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

public class Ex004FindEven {
      public static void main(String[] args) {
         int[] numbers= {4, 9, 2, 15, 7, 9};

        int evenNumbers = findEvenNumbers(numbers);
        System.out.println("The total of even numbers is: " + evenNumbers);
    }
      
      public static int findEvenNumbers(int[] numbers) {
          int count = 0;
          
          for(int i = 0; i < numbers.length; i++) {
              if((numbers[i] % 2) == 0) {
                  count++;
              }
          }
          
          return count;
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
