# Quick Sort

Quick Sort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot.
Given an array arr[], its starting position is low (the index of the array) and its ending position is high(the index of the array).

Note: The low and high are inclusive.

Implement the partition() and quickSort() functions to sort the array.

**Example 1:**

```bash
Input:
N = 5
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9
```

**Example 2:**

```bash
Input:
N = 9
arr[] = { 2, 1, 6, 10, 4, 1, 3, 9, 7}
Output:
1 1 2 3 4 6 7 9 10
```

**Your Task:**
You don't need to read input or print anything. Your task is to complete the functions partition() and quickSort() which takes the array arr[], low and high as input parameters and partitions the array. Consider the last element as the pivot such that all the elements less than(or equal to) the pivot lie before it and the elements greater than it lie after the pivot.

**Expected Time Complexity:** O(N\*logN)
**Expected Auxiliary Space:** O(logN)

**Constraints:**
1 <= N <= 103
1 <= arr[i] <= 104

### Solution

#### Java

```java
class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // Corrected to pass arr with range 0 to arr.length - 1
        myquickSort(arr, 0, arr.length - 1);
    }

    static void myquickSort(int a[], int low, int high) {
        if (low < high) {  // Corrected condition
            int pivot = partition(a, low, high);
            myquickSort(a, low, pivot - 1);  // Sort elements before pivot
            myquickSort(a, pivot + 1, high); // Sort elements after pivot
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Pivot chosen as the last element
        int i = low - 1;       // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;    // increment index of smaller element
                swap(arr, i, j);
            }
        }

        // Place the pivot at the right position
        swap(arr, i + 1, high);
        return i + 1; // Return the pivot index
    }

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
```
