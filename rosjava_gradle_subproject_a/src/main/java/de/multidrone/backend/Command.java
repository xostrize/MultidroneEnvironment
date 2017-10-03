/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.multidrone.backend;

/**
 *
 * @author student
 */
public class Command {
    private DroneCmd name;
    private int duration;
    private int strength;

    public Command(DroneCmd name, int duration,int strength) {
        this.name = name;
        this.duration = duration;
        this.strength=strength;
        
    }

    public DroneCmd getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDuration() {
        return duration;
    }

    public void setDroneCmd(DroneCmd name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCommand(Command com){
        this.name=com.getName();
        this.duration=com.getDuration();
        this.strength=com.getStrength();
    }

    @Override
    public String toString() {
        return  name.toString() + ", " + duration + ", " + strength;
    }
    
    
}
