package com.marco.bootcamp.level01_arrays;

/**
 * ========================================== Java Engineer Bootcamp Level 01 -
 * Arrays
 *
 * Exercise 003 Find Even numbers
 *
 * Time: O(n) Space: O(1) ==========================================
 */
public class Ex007FindMaxEvenNumber {

    public static void main(String[] args) {
        int[] numbers = {4, 9, 2, 15, 7, 9, 10};

        int maxEvenNumber = findMaximumEvenNumber(numbers);
        System.out.println("The maximum even number is: " + maxEvenNumber);
    }

    public static int findMaximumEvenNumber(int[] numbers) {
        int lastNum = 0;
        boolean encontrouPar = false;

        for (int number : numbers) {
            if (number % 2 == 0) {
                if (!encontrouPar || number > lastNum) {
                    lastNum = number;
                    encontrouPar = true;
                }
            }
        }

        return lastNum;
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
