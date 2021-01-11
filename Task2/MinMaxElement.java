package Task2;

import java.util.Scanner;

public class MinMaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] arrayelements = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "Please, enter your number: ");
            arrayelements[i] = input.nextInt();
        }
        System.out.println("Wich element do you need: min or max?");
        input.skip("\\R");
        String requiredOrder = input.nextLine();

        printResult(requiredOrder, arrayelements);
    }

    static int MaxElement(int... array) {
        int max = array[0];
        for (int k = 0; k < array.length; k++) {
            if (max < array[k]) {
                max = array[k];
            }
        }
        return max;
    }


    static int MinElement(int... array) {
        int min = array[0];
        for (int k = 0; k < array.length; k++) {
            if (min > array[k]) {
                min = array[k];
            }
        }
        return min;
    }

    static void printResult(String requiredValue, int[] array) {
        switch (requiredValue) {
            case "max":
                int maxElement = MaxElement(array);
                System.out.println("The maximal element is: " + maxElement);
                break;
            case "min":
                int minElement = MinElement(array);
                System.out.println("The minimal element is: " + minElement);
                break;
            default:
                System.out.println("Entered value (min or max) is not correct");
                break;
        }
    }
}


