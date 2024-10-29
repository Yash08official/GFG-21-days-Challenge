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
