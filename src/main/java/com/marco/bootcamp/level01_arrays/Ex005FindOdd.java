
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

public class Ex005FindOdd {
      public static void main(String[] args) {
         int[] numbers= {4, 9, 2, 15, 7, 9};

        int oddNumbers = findOddNumbers(numbers);
        System.out.println("The total of even numbers is: " + oddNumbers);
    }
      
      public static int findOddNumbers(int[] numbers) {
          int count = 0;
          
          for(int i = 0; i < numbers.length; i++){
              if((numbers[i] % 2) != 0 ) {
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
