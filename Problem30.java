/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteulers;

import java.math.BigInteger;
import java.util.BitSet;

/**
 *
 * @author memo
 */
public class Problem30 {

    public static void main(String[] arg) {
        int n = 1;
        int r = 0;
        int t = 0;
        int t2 = 0;
        int t3 = 0;
        while ((n++) < 200000) {
            r = n;
            t2 = 0;
            while (r > 0) {
                t = r % 10;
                r /= 10;
                t2 += Math.pow(t, 5);
            }
            if (t2 == n) {
                t3 += t2;
            }
        }
        System.out.println(t3);
    }
}
