package SortAnArray;

import java.util.Scanner;
import java.util.Arrays;

public class SortAnArray {

   /* Define your method here */
   public static void sortArray(int[] myArr, int arrSize){
    Arrays.sort(myArr);

    for(int i = 0; i < arrSize / 2; ++i) {
        int tempValue = myArr[i];
        myArr[i] = myArr[myArr.length - 1 - i];
        myArr[myArr.length - 1 - i] = tempValue;
     }
     
    for(int i = 0; i < arrSize; ++i) {
        System.out.print(myArr[i] + ",");
    }

   }

   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALUES = scnr.nextInt();
      int[] myArray = new int[NUM_VALUES];
      
      for(int i = 0; i < NUM_VALUES; ++i) {
         myArray[i] = scnr.nextInt();
      }
      
      sortArray(myArray, NUM_VALUES);
      scnr.close();
   }
}
