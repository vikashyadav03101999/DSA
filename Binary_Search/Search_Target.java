// Find the target in the given array.


import java.util.*;
public class Search_Target {
  public static void main(String[] args) {
    int arr[] = {8, 9, 10, 11, 12};
    int target = 11;
    int low = 0, high = arr.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        System.out.print(mid);
        return;
      }
      if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    System.out.print("Target is not present");
  }
}
