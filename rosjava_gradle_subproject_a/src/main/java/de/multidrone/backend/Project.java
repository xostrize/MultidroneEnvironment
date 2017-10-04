/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.multidrone.backend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.EventListenerList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import org.ros.node.ConnectedNode;


/**
 *
 * @author student
 */
public class Project implements TableModel {

    private String name;
    private ArrayList<ArrayList<Command>> project = new ArrayList<>();
    private ArrayList<Integer> lastCommand = new ArrayList<>();
    private ArrayList<String> columnName = new ArrayList<>();
    protected EventListenerList listenerList = new EventListenerList();
    private ArrayList<Drone> droneList = new ArrayList<>();
    private String song;
    private boolean interrupt;

    public String getName() {
        return name;
    }

    public ArrayList<ArrayList<Command>> getProject() {
        return project;
    }

    public ArrayList<Integer> getLastCommand() {
        return lastCommand;
    }

    public ArrayList<String> getColumnName() {
        return columnName;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public ArrayList<Drone> getDroneList() {
        return droneList;
    }
    
    public Drone getDrone(int index){
        try{
            return droneList.get(index);
        }catch(IndexOutOfBoundsException ex){
            return null;
        }
    }

    public String getSong() {
        return song;
    }

    public void setInterrupt(boolean interrupt) {
        this.interrupt = interrupt;

    }

    public Project(String name) {
        this.name = name;
        this.interrupt = false;
    }

    public void loadProject(String absolutePath, ConnectedNode connectedNode) {
        project=new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(absolutePath));
            String line = in.readLine();
            String[] column = line.split(";");
            for (String column1 : column) {
                addSubprojectNew(column1, new Drone(column1, connectedNode));
            }

            while ((line = in.readLine()) != null) {
                column = line.split(";");
                for (int i = 0; i < column.length; i++) {
                    String[] cmd= column[i].split(",");
                    addCommandToSubproject(i, new Command(DroneCmd.getCmd(cmd[0].replaceAll("\\s+","")), Integer.valueOf(cmd[1].replaceAll("\\s+","")), Integer.valueOf(cmd[2].replaceAll("\\s+",""))));
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveProject(String path) {
        try {
            PrintWriter pom = new PrintWriter(path + ".csv", "UTF-8");

            String firstLine = "";
            for (String strName : columnName) {
                firstLine += strName + ";";
            }
            pom.write(firstLine + "\n");

            int size = 0;
            for (int i = 0; i < project.size(); i++) {

                if (size < project.get(i).size()) {
                    size = project.get(i).size();
                }
            }

            for (int k = 0; k < size; k++) {
                String line = "";
                for (int i = 0; i < project.size(); i++) {

                    Command cmd = (Command) getValueAt(k, i);
                    if (cmd != null) {
                        line += cmd.toString() + ";";
                    } else {
                        line += ";";
                    }

                }
                pom.write(line + "\n");
            }
            pom.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadSong(String path) {
        song = path;
    }

    public void playProject() {
            
        ArrayList<PlayStory> storyList= new ArrayList<>();
        for(int i=0; i< project.size();i++){
            storyList.add(new PlayStory(project.get(i), droneList.get(i)));
        }
        
        for(PlayStory story: storyList){
            new Thread(story).start();
        }

    }

    public void addSubproject(ArrayList<Command> subproject, String name, Drone drone) {
        project.add(subproject);
        columnName.add(name);
        droneList.add(drone);
    }

    public void addSubprojectNew(String name, Drone drone) {
        project.add(new ArrayList<Command>());
        columnName.add(name);
        droneList.add(drone);
    }

    public void changeCell(int subproject, int indexOfCell, Command com) {
        project.get(subproject).get(indexOfCell).setCommand(com);
    }

    public void addCommandToSubproject(int subproject, Command com) {
        project.get(subproject).add(com);
    }

    @Override
    public int getRowCount() {
        int min = 0;
        for (ArrayList<Command> list : project) {
            if (min < list.size()) {
                min = list.size();
            }
        }
        return min;
    }

    @Override
    public int getColumnCount() {
        return project.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnName.get(columnIndex);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Command.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            return project.get(columnIndex).get(rowIndex);
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        project.get(columnIndex).get(rowIndex).setCommand((Command) aValue);
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        listenerList.add(TableModelListener.class, l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        listenerList.remove(TableModelListener.class, l);
    }

    public void clean() {
        for (ArrayList<Command> pom : project) {
            pom.clear();
        }
        for (Integer pom : lastCommand) {
            pom = 0;
        }

    }

    public void loadSound(String absolutePath) {
        song=absolutePath;
    }
}
