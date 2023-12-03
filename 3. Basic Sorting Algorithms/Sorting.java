package BasicSorting;

//  Sorting -> Arrange in an order.
public class Sorting {

    public static void insertionSort(int arr[]) {    //  Big O(n^2)

        int n = arr.length;
        for (int i = 1; i <= n - 1; i++) {
            int curr = arr[i];
            int prev = i - 1;
            //  finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //  inseration
            arr[prev + 1] = curr;
        }
    }

    public static void selectionSort(int arr[]) {    //  Big O(n^2)

        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int minPos = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swapping
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void OptimizedBubbleSort(int arr[]) {  //  Big O(n)

        boolean swap = false;
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {    //  turns
            for (int j = 0; j <= n - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //  swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
                if (!swap) {
                    break;
                }
            }
        }
    }

    public static void bubbleSort(int arr[]) {  //  Big O(n^2)

        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {    //  turns
            for (int j = 0; j <= n - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //  swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {5, 4, 1, 3, 2};
       
        bubbleSort(arr);
        //OptimizedBubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        
        print(arr);
    }
}

