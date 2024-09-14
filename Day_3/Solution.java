public class Solution {
  public void rearrange(int[] arr) {
    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> neg = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        neg.add(arr[i]);
      } else {
        pos.add(arr[i]);
      }
    }
    int k = 0;
    int l = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0 && k < pos.size()) {
        arr[i] = pos.get(k++);
      } else if (i % 2 != 0 && l < neg.size()) {
        arr[i] = neg.get(l++);
      } else if (k == pos.size() && l < neg.size()) {
        arr[i] = neg.get(l++);
      } else {
        arr[i] = pos.get(k++);
      }
    }
  }
}
