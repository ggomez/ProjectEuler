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
public class Problem20 {
    public static void main(String[] arg){
             BigInteger n=new BigInteger("100");
             BigInteger r=new BigInteger(n.toString());
             while(n.intValue() != 1){
                 n=n.subtract(BigInteger.ONE);
                 r=r.multiply(n);
             }
             BigInteger t=new BigInteger("0");
             BigInteger t2=new BigInteger("0");
             while(r.compareTo(BigInteger.ZERO) == 1){
                 t2=r.remainder(BigInteger.TEN);
                 r = r.divide(BigInteger.TEN);
                 t = t.add(t2); 
             }
             System.out.println(t);              
    }  
}
