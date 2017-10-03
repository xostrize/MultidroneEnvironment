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
public enum DroneCmd {

    LAND("Land"),
    TAKE_OFF("Takeoff"),
    FORWARD("Forward"),
    BACKWARD("Backward"),
    LEFT("Left"),
    RIGHT("Right"),
    UP("Up"),
    DOWN("Down"),
    TURN_LEFT("Turn_Left"),
    TURN_RIGHT("Turn_Right"),
    HOVER("Hover");

    private final String cmd;

    private DroneCmd(String cmd) {
        this.cmd = cmd;
    }

    @Override
    public String toString() {
        return cmd;
    }

    public static DroneCmd getCmd(String name) {
        switch (name) {
            case "Land":
                return DroneCmd.LAND;
            case "Takeoff":
                return DroneCmd.TAKE_OFF;
            case "Forward":
                return DroneCmd.FORWARD;
            case "Backward":
                return DroneCmd.BACKWARD;
            case "Left":
                return DroneCmd.LEFT;
            case "Right":
                return DroneCmd.RIGHT;
            case "Up":
                return DroneCmd.UP;
            case "Down":
                return DroneCmd.DOWN;
            case "Turn_Left":
                return DroneCmd.TURN_LEFT;
            case "Turn_Right":
                return DroneCmd.TURN_RIGHT;
            case "Hover":
                return DroneCmd.HOVER;
            default:
                return null;
        }

    }
}
