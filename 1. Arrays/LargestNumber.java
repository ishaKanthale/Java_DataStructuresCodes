package Arrays;

public class LargestNumber {

    public static int getLargest(int arr[]) {

        int largest = Integer.MIN_VALUE;    //  -infinity

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int arr[]) {

        int smallest = Integer.MAX_VALUE;    //  +infinity

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 6, 3, 5};

        System.out.println(getLargest(arr));
        System.out.println(getSmallest(arr));
    }
}
