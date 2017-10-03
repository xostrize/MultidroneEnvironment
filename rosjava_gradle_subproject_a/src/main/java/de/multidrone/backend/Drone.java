/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.multidrone.backend;

import ardrone_autonomy.Navdata;
import geometry_msgs.Twist;
import org.ros.message.MessageListener;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Publisher;
import org.ros.node.topic.Subscriber;
import std_msgs.Empty;

/**
 *
 * @author student
 */
public class Drone {

    private String name;
    private final Publisher<Empty> takeoff;
    private final Publisher<Empty> land;
    private final Publisher<Empty> takeoffSim;
    private final Publisher<Empty> landSim;
    private final Publisher<Twist> cmd;
    private Navdata droneData;
    private long time;

    public Drone(String name, ConnectedNode con) {
        time = 0;
        takeoff = con.newPublisher("/" + name + "/ardrone/takeoff", Empty._TYPE);
        land = con.newPublisher("/" + name + "/ardrone/land", Empty._TYPE);
        takeoffSim = con.newPublisher("/" + name + "/takeoff", Empty._TYPE);
        landSim = con.newPublisher("/" + name + "/land", Empty._TYPE);
        cmd = con.newPublisher("/" + name + "/cmd_vel", Twist._TYPE);
        Subscriber<Navdata> subscriber = con.newSubscriber("/" + name + "/ardrone/navdata", Navdata._TYPE);
        subscriber.addMessageListener(new MessageListener<Navdata>() {

            @Override
            public void onNewMessage(Navdata t) {
                droneData = t;
                time = System.currentTimeMillis();
            }
        });
    }

    public long getTimeOfLastMessage() {
        return time;
    }

    public void takeoff() {
        takeoff.publish(takeoff.newMessage());
        takeoffSim.publish(takeoffSim.newMessage());

    }

    public void land() {
        land.publish(land.newMessage());
        landSim.publish(landSim.newMessage());
    }

    public void hover() {
        createGeometryMessage(0, 0, 0, 0, 0, 0);
    }

    public void forward(int power) {
        if (checkPower(power)) {
            createGeometryMessage(calcPower(true, power), 0, 0, 0, 0, 0);
        }
    }

    public void backward(int power) {
        if (checkPower(power)) {
            createGeometryMessage(calcPower(false, power), 0, 0, 0, 0, 0);
        }
    }

    public void left(int power) {
        if (checkPower(power)) {
            createGeometryMessage(0, calcPower(false, power), 0, 0, 0, 0);
        }
    }

    public void right(int power) {
        if (checkPower(power)) {
            createGeometryMessage(0, calcPower(true, power), 0, 0, 0, 0);
        }
    }

    public void up(int power) {
        if (checkPower(power)) {
            createGeometryMessage(0, 0, calcPower(true, power), 0, 0, 0);
        }
    }

    public void down(int power) {
        if (checkPower(power)) {
            createGeometryMessage(0, 0, calcPower(false, power), 0, 0, 0);
        }
    }

    public void turnLeft(int power) {
        if (checkPower(power)) {
            createGeometryMessage(0, 0, 0, 0, 0, calcPower(false, power));
        }
    }

    public void turnRight(int power) {
        if (checkPower(power)) {
            createGeometryMessage(0, 0, 0, 0, 0, calcPower(true, power));
        }
    }
    
    private double calcPower(boolean positive, int power){
        if(positive){
            return power/100;
        }else{
            return ((power/100)*(-1));
        }
    }

    private void createGeometryMessage(double Lx, double Ly, double Lz, double Ax, double Ay, double Az) {
        Twist str = cmd.newMessage();
        str.getLinear().setX(Lx);
        str.getLinear().setY(Ly);
        str.getLinear().setZ(Lz);

        str.getAngular().setX(Ax);
        str.getAngular().setY(Ay);
        str.getAngular().setZ(Az);
        cmd.publish(str);
    }

    public Navdata getNavdata() {
        return droneData;
    }

    public void runCmd(DroneCmd cmd, int power) {
        switch (cmd) {
            case TAKE_OFF:
                this.takeoff();
                break;
            case LAND:
                this.land();
                break;
            case FORWARD:
                this.forward(power);
                break;
            case BACKWARD:
                this.backward(power);
                break;
            case LEFT:
                this.left(power);
                break;
            case RIGHT:
                this.right(power);
                break;
            case UP:
                this.up(power);
                break;
            case DOWN:
                this.down(power);
                break;
            case TURN_LEFT:
                this.turnLeft(power);
                break;
            case TURN_RIGHT:
                this.turnRight(power);
                break;
            case HOVER:
                this.hover();
                break;
            default:
                this.hover();
                break;

        }
    }

    private boolean checkPower(int power) {
        if (power >= 0 && power <= 100) {
            return true;
        } else {
            throw new OutOfRangeException("the value of power is " + power);
        }
    }
}
