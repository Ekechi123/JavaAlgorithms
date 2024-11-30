// BinarySearchTest.java
public class BinarySearchTest {
    public static void main(String[] args) {
        // Test 1: Target is in the middle of the array
        int[] arr1 = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(binarySearch(arr1, 7));  // Expected output: 3

        // Test 2: Target is at the beginning
        int[] arr2 = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(binarySearch(arr2, 1));  // Expected output: 0

        // Test 3: Target is at the end
        int[] arr3 = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(binarySearch(arr3, 13)); // Expected output: 6

        // Test 4: Target is not in the array
        int[] arr4 = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(binarySearch(arr4, 4));  // Expected output: -1
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;  // Found target
            }

            if (arr[mid] < target) {
                left = mid + 1;  // Target is in the right half
            } else {
                right = mid - 1;  // Target is in the left half
            }
        }
        return -1;  // Target not found
    }
}

