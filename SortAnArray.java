package SortAnArray;

import java.util.Scanner;
import java.util.Arrays;

public class SortAnArray {

   /* Define your method here */
   public static void sortArray(int[] myArr, int arrSize){
    Arrays.sort(myArr);

    System.out.println("Array Sorted Ascending: ");
    for(int i = 0; i < arrSize; ++i){
        System.out.println(myArr[i]);   
    }


   }

   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALUES = scnr.nextInt();
      System.out.println("NUM_VALUES: " + NUM_VALUES);
      int[] myArray = new int[NUM_VALUES];
      
      for(int i = 0; i < NUM_VALUES; ++i) {
         myArray[i] = scnr.nextInt();
         System.out.println(myArray[i] + ", ");
      }
      
      sortArray(myArray, NUM_VALUES);
      scnr.close();
   }
}
