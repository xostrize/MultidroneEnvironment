/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.multidrone.backend;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class PlayStory implements Runnable{

            
            private ArrayList<Command> choreography;
            private Drone drone;
            private Boolean interrupt;
            
            public PlayStory(ArrayList<Command> listOfCmd,Drone drone){
                this.choreography=listOfCmd;
                this.drone=drone;
                this.interrupt=false;
            }
            
            @Override
            public void run() {
                for (Command cmd : choreography) {
                    try {
                        if (!interrupt) {
                            drone.runCmd(cmd.getName(), cmd.getStrength());

                            Thread.sleep(cmd.getDuration());

                        } else {
                            drone.runCmd(DroneCmd.HOVER, 100);
                            Thread.sleep(1000);
                            drone.runCmd(DroneCmd.LAND, 100);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            public void setInterrupt(Boolean var){
                interrupt=var;
            }
}
