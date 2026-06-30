/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marco.bootcamp.level01_arrays;

/**
 * ==========================================
 * Java Engineer Bootcamp
 * Level 01 - CalculateAvarage
 *
 * Exercise 003
 * Find The Avarage Number
 *
 * Time: O(n)
 * Space: O(1)
 * ==========================================
 */

public class Ex003FindAvarage {
      public static void main(String[] args) {
         double[] numbers= {4, 9, 2, 15, 7, 9};

        double avarageResult = findAvarage(numbers);
        System.out.println("The avarage is: " + avarageResult);
    }
      
      public static double findAvarage(double[] numbers) {
          double avarage = numbers[0];
          
          for(int i = 1; i < numbers.length; i++) {
              avarage += numbers[i];
         }
          
         return avarage / numbers.length;
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
 * Find the avarage number in an array of double
 *
 * What I Learned:
 * - How to calculate the avarage
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
