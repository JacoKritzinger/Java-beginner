/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author Jaco
 */
public class Example9_12 {
  public static void main(String args[]) { 
     
    for(int i=0; i < 3; i++) { 
      UseFinally.genException(i); 
      System.out.println(); 
    } 
  } 
}
