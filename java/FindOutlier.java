/*
    You are given an array (which will have a length of at least 3, but could be very large) containing integers. 
    The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single 
    integer N. Write a method that takes the array as an argument and returns this "outlier" N.
*/

public class FindOutlier {
  static int find(int[] integers) {
    int oddCount = 0, evenCount = 0;
    int lastOddIdx = 0, lastEvenIdx = 0;

    for (int i = 0; i < integers.length; i++) {
        if (integers[i] % 2 == 0) {
            oddCount ++;
            lastOddIdx = i;
        }
        else {
            evenCount++;
            lastEvenIdx = i;
        }
    }

    if (oddCount == 1)
        return integers[lastOddIdx];
    else if (evenCount == 1)
        return integers[lastEvenIdx];
    else
        return -1;
  }

  public static void main(String[] args) {
    int[] integers = {1, 1, 1, 1, 1, 2, 1, 1, 1};
    System.out.println(find(integers));
  }

}


