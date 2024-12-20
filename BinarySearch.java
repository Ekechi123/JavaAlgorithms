/**
 * Performs binary search on a sorted array.
 *
 * @param arr The sorted array in which to search.
 * @param target The value to search for.
 * @return The index of the target element if found, otherwise -1.
 */

// BinarySearch.java
public class BinarySearch {
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

