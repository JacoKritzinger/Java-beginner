///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package chapter11;
//
///**
// *
// * @author Jaco
// */
//public class Example11_3 {
//  public static void main(String args[]) {
//    System.out.println("Main thread starting.");
//
//    MyThread mt = new MyThread("Child #1");
//
//    mt.start();    
//
//    for(int i=0; i < 50; i++) {
//      System.out.print(".");
//      try {
//        Thread.sleep(100);
//      }
//      catch(InterruptedException exc) {
//        System.out.println("Main thread interrupted.");
//      }
//    } 
//
//    System.out.println("Main thread ending.");
//  }
//}
