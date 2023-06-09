package com.myproject.Hw2;

import java.util.Arrays;

public class ExamplesPrac {
    public static void main(String[] args) {
        //#1 How to initialize an array
        int[] numbers = new int[5];

        //#2 How to get an element from the array
        int element = numbers[2];

        //#3 How to use and array in a loop and print it
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //#4 How to print an array
        System.out.println(Arrays.toString(numbers));

        //#5 How to sort an array
        Arrays.sort(numbers);

        //#6 How to check if two arrays are equal
        //boolean areEqual = Arrays.equals(array1, array2);

        /*
            #7 Multi-Dimensional / 2D Array
            1D =
            int[] matrix = {
            {1,2,3,4,5}
            }
            2D =
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
};
         */



    }
}
