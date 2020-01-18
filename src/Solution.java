import java.io.*;
import java.util.*;

public class Solution {
    static int[] reverseArray(int[] a) {
        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        return a;

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 10};
        int[] ints = reverseArray(arr);
        for (int res : ints) {
            System.out.println(res);

        }

    }
}
