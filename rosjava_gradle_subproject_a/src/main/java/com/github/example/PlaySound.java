/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.*;

        /**
         *
         * @author student
         */

public class PlaySound {

    public static void main(String[] args) {
        InputStream in;
        try {
            in = new FileInputStream("/home/student/Downloads/Vivaldi.wav");
            AudioStream audio = new AudioStream(in);
            AudioPlayer.player.start(audio);
            Thread.sleep(10000);
            AudioPlayer.player.stop(audio);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PlaySound.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PlaySound.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(PlaySound.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
