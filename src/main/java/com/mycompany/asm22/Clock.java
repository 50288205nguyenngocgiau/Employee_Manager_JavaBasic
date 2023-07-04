/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.asm22;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author giau7
 */
public class Clock implements Runnable{
    JTextField field;
    
    public Clock(JTextField field){
        this.field = field;
    }

    @Override
    public void run() {
        while(true){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        field.setText(sdf.format(date));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
    }
    }
    
}
