/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.multidrone.frontend;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author student
 */
public class MyButton extends JButton implements ActionListener{
    private boolean state;

    public MyButton(String name) {
        super(name);
        state=false;
        setBackground(Color.red);
    }
    
    public boolean getState(){
        return state;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(state){
            setBackground(Color.red);
            state=false;
        }else{
            setBackground(new Color(0,104,201,255));
            state=true;
        }
    }
    
    
    
}
