package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 9, 16, 40, 50, 60};

        for (int i = 0; i < findLargestAndSmallest(array).length; i++) {
            System.out.println(findLargestAndSmallest(array)[i]);
        }

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 160; i++) {
            intList.add(i);
            intList.add(i);
        }
        System.out.println(sumOfTwoLargest(intList));

        }




        /**
         * Question 1: Find the smallest and largest numbers in an array
         *
         * You are given an array of integers, with at least two values.
         * Find the smallest and largest numbers in the array, and pass them back in an array containing two values,
         * the smallest and the largest.
         *
         * @param array An array of integers with at least two values
         * @return An array of integers with two elements, the largest and smallest from the method parameter
         */
        public static int[] findLargestAndSmallest(int array[]){

            int smallest = array[0];
            int largest = array[0];
            int[] findLargestAndSmallest = new int[2];

            for (int i = 0; i < array.length; i++) {
                if (array[i] > largest)
                    largest = array[i];
                else if (array[i] < smallest)
                    smallest = array[i];
            }
            findLargestAndSmallest[0] = smallest;
            findLargestAndSmallest[1] = largest;
            return findLargestAndSmallest;
        }


        /**
         * Questions 2
         *
         * Given a List of Integers, return the sum of the two largest values.
         *
         * If the array is empty, return 0.
         * If the array has one value, return that value.
         *
         * @param intList A List of integers of any size.
         * @return Sum of the two largest values
         */
        public static int sumOfTwoLargest(List intList){

                  if (intList.size() == 0) {
                      return 0;
                  }
                  else if (intList.size() == 1) {
                      return (int) intList.get(0);
                  }
                  else {
                      int largest = (int) intList.get(0);
                      int secondLargest = (int) intList.get(0);

                      for (int i = 0; i < intList.size(); i++) {
                          if ((int) intList.get(i) > largest) {
                              largest = (int) intList.get(i);
                          }
                      }
                        intList.remove(largest);
                           for (int i = 0; i < intList.size(); i++) {
                               if ((int) intList.get(i) > secondLargest) {
                                   secondLargest = (int) intList.get(i);
                                   }
                               }
                         return largest + secondLargest;
                       }
        }


        }


        /**
         * Question3: Remove duplicates from a List
         *
         * You are given a List of Integers that might have duplicates. You must remove any duplicates from the List,
         * and return a List that doesn't contain duplicates. The order of the elements in the original List
         * does not need to be kept the same.
         *
         * You MAY use any collections types you wish, but the method must return a List.
         *
         * Example: [1,4,3,2,1] would return, in any order, [1,2,3,4]
         *
         * @param intList A List of Integers that may or may not include duplicates
         * @return A List of Integers that doesn't contain duplicates.
         */


