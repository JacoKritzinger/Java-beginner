/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 *
 * @author Jaco
 */
public class javaShuffle1 {
    public static void main(String [] args) {

    int x = 3;
    while (x > 0) {
    
    
        if (x > 2) {
            System.out.print("a");
        }
    
        x = x - 1;
        System.out.print("-");
    
        if (x == 2) ; {
            System.out.print("b c");
        }
   
        if (x == 1) {
            System.out.print("d");
            x = x - 1;
        }
      }
   }
}