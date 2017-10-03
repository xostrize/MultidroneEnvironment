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
public class OutOfRangeException extends IndexOutOfBoundsException{
    
    public OutOfRangeException(String message){
        super(message);
    }
    
}
