/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.multidrone.backend.osc;

/**
 *
 * @author student
 */
public class OSCContainer {
    public OSCenum cmdForWindow;
    
    public OSCContainer(OSCenum cmd){
        cmdForWindow=cmd;
    }
    
    public OSCenum getCmd(){
        return cmdForWindow;
    }
    
}
