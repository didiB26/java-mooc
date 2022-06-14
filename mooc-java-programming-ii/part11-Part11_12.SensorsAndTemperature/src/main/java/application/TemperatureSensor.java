/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author didiBalasic
 */
public class TemperatureSensor implements Sensor {
    
    private boolean x;
    
    public TemperatureSensor(){
        
        this.x = false;
    }

    @Override
    public boolean isOn() {
        if (this.x == true){
            return true;
        }
        
        return false;
    }

    @Override
    public void setOn() {
        this.x = true;
    }

    @Override
    public void setOff() {
        this.x = false;
    }

    @Override
    public int read() {
        int numar;
        if (this.isOn() == true){
            numar = new Random().nextInt(61) - 30;
        } else {
            throw new IllegalStateException("Nu e ok");
        }
        return numar;
    }
    
}
