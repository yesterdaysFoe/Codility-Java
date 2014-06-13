package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author David Daniel Kurtz <daviddanielkurtz@gmail.com>
 */
public class MinAbsSliceSum {

    public int solution(int[] A) {
        final int n = A.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }
                list.add(Math.abs(sum));
            }
        }
        Collections.sort(list);
        return list.get(0);
    }

    public static void main(String[] args) {
        int[] a = {2, -4, 6, -3, 9};
        System.out.println("Answer: " + new MinAbsSliceSum().solution(a));
    }
}
