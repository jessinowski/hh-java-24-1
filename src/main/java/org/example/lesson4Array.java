package org.example;

import java.util.Arrays;

public class lesson4Array {
    public static void main(String[] args) {

        // Step 1: Create an array with numbers from 1 to 10 and print it to the console
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        printArray(numbers);

        //Step 2: Calculate the sum of all numbers in the array and print the result to the console
        System.out.println();

        sumUpArray(numbers);

        //Step 3: Find the largest number in the array and print it to the console.
        System.out.println();

        findMax(numbers);

        //Step 4: Create a second array with numbers from 11 to 20.
        int[] numbers2={11,12,13,14,15,16,17,18,19,20};

        //Step 5: Perform element-wise addition of both arrays and store the result in a third array. Print the result array to the console.
        System.out.println();

        createArrayOfTwoArrays(numbers, numbers2);

    }

    // Step 1: Create an array with numbers from 1 to 10 and print it to the console

    public static void printArray(int[] arr){
        for(int number:arr){
            System.out.println(number);
        }
    }

    //Step 2: Calculate the sum of all numbers in the array and print the result to the console
     public static void sumUpArray(int[] arr){
         int sum =0;
         for(int number:arr){
             sum += number;
         }
         System.out.println(sum);
     }

    //Step 3: Find the largest number in the array and print it to the console.
    public static void findMax(int[] arr){
        int max=arr[0];
        for(int number:arr){
            if(number>max){
                max=number;
            }
        }
        System.out.println(max);
    }

    //Step 5: Perform element-wise addition of both arrays and store the result in a third array. Print the result array to the console.

    public static void createArrayOfTwoArrays(int[] firstArr, int[] secondArr){
        int[] numbers3= new int[firstArr.length];
        for(int i=0;i<firstArr.length;i++){
            numbers3[i] =firstArr[i]+secondArr[i];
        }
        for(int result:numbers3){
            System.out.println(result);
        }
    }



}
