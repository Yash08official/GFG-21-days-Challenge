class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (!map.containsKey(sum))   map.put(sum, new ArrayList<>());
                map.get(sum).add(new int[] {i, j});
            }
        }

        for (int i = 0; i < n; i++) {
            int rem = -arr[i];
            if (map.containsKey(rem)) {
                for (int[] p : map.get(rem)) {
                    if (p[0] < i && p[1] < i) {
                        List<Integer> temp = Arrays.asList(p[0], p[1],i);
                        ans.add(temp);
                    }
                }
            }
        }

        return ans;
    }
}