package org.example;

import java.util.Arrays;

public class lesson4Array {
    public static void main(String[] args) {

        // Step 1: Create an array with numbers from 1 to 10 and print it to the console

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for(int number:numbers){
            System.out.println(number);
        }

        System.out.println();
        //Step 2: Calculate the sum of all numbers in the array and print the result to the console

        int sum =0;
        for(int number:numbers){
            sum += number;
        }
        System.out.println(sum);

        System.out.println();
        //Step 3: Find the largest number in the array and print it to the console.
        int max=numbers[0];
        for(int number:numbers){
            if(number>max){
                max=number;
            }
        }
        System.out.println(max);

        System.out.println();
        //Step 4: Create a second array with numbers from 11 to 20.

        int[] numbers2={11,12,13,14,15,16,17,18,19,20};

        System.out.println();
        //Step 5: Perform element-wise addition of both arrays and store the result in a third array. Print the result array to the console.

        int[] numbers3= new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            numbers3[i] =numbers[i]+numbers2[i];
        }
        for(int result:numbers3){
            System.out.println(result);
        }

    }





}
