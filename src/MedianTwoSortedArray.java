import java.util.Arrays;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] num1 = new int[2];
        int[] num2 = new int[2];

        for (int i = 0; i < num1.length; i++) {
            num1[i] = rand.nextInt(100) + 1;
        }
        for (int i = 0; i < num2.length; i++) {
            num2[i] = rand.nextInt(100) + 1;
        }

        Arrays.sort(num1);
        Arrays.sort(num2);

        System.out.println("Sorted num1: " + Arrays.toString(num1));
        System.out.println("Sorted num2: " + Arrays.toString(num2));

        double median = findMedianSortedArrays(num1, num2);
        System.out.println("Median is: " + median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;

        // Ensure nums1 is the smaller array for binary search
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int low = 0, high = m;
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted properly.");
    }
}
