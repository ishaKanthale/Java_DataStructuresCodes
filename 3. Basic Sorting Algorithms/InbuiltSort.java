package BasicSorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void print(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // increasing 
        int arr[] = {5, 4, 1, 3, 2};
        //Arrays.sort(arr);
        Arrays.sort(arr, 0, 3); //  1 4 5 3 2 
        print(arr);

        // decereasing
        Integer arr1[] = {5, 4, 1, 3, 2};
        //Arrays.sort(arr1, Collections.reverseOrder());
        Arrays.sort(arr1, 0, 3, Collections.reverseOrder()); //  5 4 1 3 2
        print(arr1);
    }
}
