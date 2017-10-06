/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.multidrone.backend.osc;

import com.illposed.osc.OSCListener;
import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPort;
import com.illposed.osc.OSCPortIn;
import de.multidrone.frontend.AppWindow;
import java.net.SocketException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class OSClistener {

    private OSCPortIn receiver;
    private static AppWindow app;
    
    public OSClistener(AppWindow app) {
        OSClistener.app=app;
        try {
            this.receiver = new OSCPortIn(OSCPort.defaultSCOSCPort());
        } catch (SocketException ex) {
            Logger.getLogger(OSClistener.class.getName()).log(Level.SEVERE, null, ex);
        }
        receiver.addListener("/software/start", new OSCListener() {

            @Override
            public void acceptMessage(Date time, OSCMessage message) {
                   OSClistener.createOSCdirection(new OSCContainer(OSCenum.START));
            }
        });
        receiver.addListener("/software/reset", new OSCListener() {

            @Override
            public void acceptMessage(Date time, OSCMessage message) {
                    OSClistener.createOSCdirection(new OSCContainer(OSCenum.RESET));
            }
        });

        receiver.addListener("/software/stop", new OSCListener() {

            @Override
            public void acceptMessage(Date time, OSCMessage message) {
                OSClistener.createOSCdirection(new OSCContainer(OSCenum.RESET));
            }
        });
        receiver.startListening();

    }
    
    public static void createOSCdirection(OSCContainer container){
        app.runOSCdirection(container);
    }

}
