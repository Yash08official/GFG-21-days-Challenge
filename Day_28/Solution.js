class Solution {

    maxDistance(arr) {
        // Use of Map here first
        let map = new Map();

        // We need to find the length of arr and initialize ans to 0
        let n = arr.length, ans = 0;

        // We need a for loop now
        for (let i = 0; i < n; i++) {

            // If the element is present or map contains the element
            if (map.has(arr[i])) {

                // Current index - previous index present in map
                let diff = i - map.get(arr[i]);

                // Update the answer
                ans = Math.max(ans, diff);
            } else {

                // If not present, then add current element with index
                map.set(arr[i], i);
            }
        }

        return ans;
    }
}
