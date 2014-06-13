package codility;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David Daniel Kurtz <daviddanielkurtz@gmail.com>
 */
public class CountMultiplicativePairs {

    public int solution(int[] A, int[] B) throws Exception {
        if (A.length != B.length) {
            throw new Exception("Invalid array length. Both array should have the same length.");
        }
        double[] c = new double[A.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = (double) A[i] + ((double) B[i] / (double) 1000000);
        }
        int n = c.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                final double product = c[i] * c[j];
                final double sum = c[i] + c[j];
                if (product >= sum) {
                    count++;
                }
            }
        }
        if (count > 1000000000) {
            return 1000000000;
        }
        return count;
    }

    public static void main(String[] args) {
        try {
            int[] a = {0, 1, 2, 3, 5};
            int[] b = {500000, 500000, 0, 0, 20000};
            System.out.println("Answer: " + new CountMultiplicativePairs().solution(a, b));
        } catch (Exception ex) {
            Logger.getLogger(CountMultiplicativePairs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
