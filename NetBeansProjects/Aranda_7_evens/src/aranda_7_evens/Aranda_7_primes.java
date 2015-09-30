/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aranda_7_evens;

/**
 *
 * @author Evan
 */
public class Aranda_7_primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 0; i < 10000000; i++) {
               if(isPrime(i)) {
                   counter += 1;
               System.out.println(i + " is prime.");     
               }
               }
               System.out.println("We have"
                       + counter + "evens");
        } static boolean isEven (int somenumber){
                   return ( somenumber % 2 == 0);
        }
        static boolean isOdd (int somenumber){
                   return ( somenumber % 2 == 0);
        }
        static boolean isPrime (int somenumber){
            int divisor = 0;
            for (int i = 2; i< somenumber; i++){
                if(somenumber % i != 0) {
                    divisor += 1;
                } 
        }
     return (divisor == 0);   
        }
}
