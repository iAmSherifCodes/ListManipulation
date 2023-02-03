package GraceArray;

import java.util.Arrays;

public class ArrayManipulation {
    public static int[] multiply(int[] numbers) {
        int [] multiply = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            int count = numbers[i] * numbers[i];
            multiply[i] = count;
        }
        return multiply;
    }

    public static int[] ascending(int[] numbers) {
        int count =0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]){
                    count = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = count;
                }

            }

        }
        return numbers;
    }

    public static int[] descending(int[] numbers) {
        int count = 0;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]){
                    count = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = count;
                }

            }

        }
        return numbers;
    }



    public static void main(String[] args) {
        int [] numbers = {2,4,6,3,5,1};

        System.out.println(Arrays.toString(ArrayManipulation.multiply(numbers)));
        System.out.println(Arrays.toString(ArrayManipulation.ascending(numbers)));
        System.out.println(Arrays.toString(ArrayManipulation.descending(numbers)));
        
    }


}
