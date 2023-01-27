/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.arsw.threads;

import edu.eci.arsw.math.PiDigits;

/**
 *
 * @author yorks.gomez
 */
public class PIThread extends Thread {

    private final int start, end;
	private byte[] digits;
    
    public PIThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    @Override
    public void run() {
        PiDigits.getDigitsSection(start, end);
    }
    
    public byte[] getDigits() {
        return digits;
    }
    
}
