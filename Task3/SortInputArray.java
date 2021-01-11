package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class SortInputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "Please, enter your number: ");
            array[i] = input.nextInt();
        }
        System.out.println("Tell what do with array: min or max");
        input.skip("\\R");
        String requiredOrder = input.nextLine();

        printResult(requiredOrder, array);
    }

    static int[] MaxSort(int... array) {
        for (int k = 0; k < array.length - 1; k++) {
            for (int l = 0; l < array.length - 1; l++) {
                if (array[l] > array[l + 1]) {
                    int buffer = array[l];
                    array[l] = array[l + 1];
                    array[l + 1] = buffer;
                }

            }
        }
        return array;
    }

    static int[] MinSort(int... array) {
        for (int k = 0; k < array.length - 1; k++) {
            for (int l = 0; l < array.length - 1; l++) {
                if (array[l] < array[l + 1]) {
                    int buffer = array[l + 1];
                    array[l + 1] = array[l];
                    array[l] = buffer;
                }

            }
        }
        return array;
    }

    static void printResult(String requiredOrder, int[] array) {
        switch (requiredOrder) {
            case "max":
                int[] ascSortedArray = MaxSort(array);
                System.out.println("The sorted array in ASC order is: " + Arrays.toString(ascSortedArray));
                break;
            case "min":
                int[] descSortedArray = MinSort(array);
                System.out.println("The sorted array in DESC order is: " + Arrays.toString(descSortedArray));
                break;
            default:
                System.out.println("Entered value (min or max) is not correct");
                break;
        }
    }
}



