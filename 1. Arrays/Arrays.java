package Arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        //  Indroduction
        /*
        Arrays -> "List of elements of the same type 
        placed in a contiguous memeory location."
        #Arrays has a static type.
         */
        //  Operation in Arrays
        // Create
        int marks1[] = new int[50];  //  it stores 0s
        int numbers[] = {1, 2, 3};
        int moreNumbers[] = {4, 5, 6};
        String fruits[] = {"apple", "mango", "orange"};

        // Input
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();    // phy
        marks[1] = sc.nextInt();    // chem
        marks[2] = sc.nextInt();    // math

        // Output
        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        // Update
//        marks[2] = 100;
        marks[2] += 1;
        System.out.println("math : " + marks[2]);

        //  Calculate percentage
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage : " + percentage + "%");

        //  Calculate length of an array
        System.out.println("length of array : " + marks.length);    //  100
    }
}
