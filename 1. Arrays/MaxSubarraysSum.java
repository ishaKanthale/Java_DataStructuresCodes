package Arrays;

public class MaxSubarraysSum {

    public static void bruteForceApproach(int arr[]) {

        int maxSubarraySum = Integer.MIN_VALUE;
        int minSubarraySum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {  //  start
            for (int j = i; j < arr.length; j++) {  //  end
                int sum = 0;
                for (int k = i; k <= j; k++) {  //  calculate subarray sum
                    sum += arr[k];
                }
                if (sum > maxSubarraySum) {
                    maxSubarraySum = sum;
                }
                if (sum < minSubarraySum) {
                    minSubarraySum = sum;
                }
            }
        }

        System.out.println("Max Subarray Sum : " + maxSubarraySum);
        System.out.println("Min Subarray Sum : " + minSubarraySum);
    }

    public static void main(String[] args) {

        int numbers[] = {1, -2, 6, -1, 3};

        bruteForceApproach(numbers);
    }
}
