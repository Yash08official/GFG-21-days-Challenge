class Solution {
    rearrange(arr) {
      let pos = [];
      let neg = [];
      for (let i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
          neg.push(arr[i]);
        } else {
          pos.push(arr[i]);
        }
      }
      let k = 0;
      let l = 0;
      for (let i = 0; i < arr.length; i++) {
        if (i % 2 === 0 && k < pos.length) {
          arr[i] = pos[k++];
        } else if (i % 2 !== 0 && l < neg.length) {
          arr[i] = neg[l++];
        } else if (k === pos.length && l < neg.length) {
          arr[i] = neg[l++];
        } else {
          arr[i] = pos[k++];
        }
      }
    }
  }