package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6,4,5,2,7,8,1,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            boolean swap = false;
            for (int j = 1; j <arr.length - i ; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }

        }
    }
}