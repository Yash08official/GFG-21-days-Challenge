// Sort the array to bring smaller elements at the start and larger at the end
Arrays.sort(arr);
        
int n = arr.length;
long sum = 0;

// Calculate the sum of differences
for(int i = 0; i < n / 2; i++){
    // Add twice the larger element (maximize positive contribution)
    sum += 2 * arr[n - i - 1];
    // Subtract twice the smaller element (minimize negative contribution)
    sum -= 2 * arr[i];
}
return sum;