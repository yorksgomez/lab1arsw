/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
       CountThread countThread1 = new CountThread(0, 99);
       CountThread countThread2 = new CountThread(99, 199);
       CountThread countThread3 = new CountThread(200, 299);
       Thread hilo1 = new Thread(countThread1);
       Thread hilo2 = new Thread(countThread2);
       Thread hilo3 = new Thread(countThread3);
       hilo1.run();
       hilo2.run();
       hilo3.run();
    }
}
