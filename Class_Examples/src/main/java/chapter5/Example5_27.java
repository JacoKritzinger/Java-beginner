/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author Jaco
 */
public class Example5_27 {
  public static void main(String args[]) { 
    char ch;  
  
    for(int i=0; i < 10; i++) { 
      ch = (char) ('a' + i);  
      System.out.print(ch); 
 
      // This statement turns off the 6th bit.   
      ch = (char) ((int) ch & 65503); // ch is now uppercase  
  
      System.out.print(ch + " ");  
    } 
  } 
}
