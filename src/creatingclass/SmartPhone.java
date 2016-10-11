/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creatingclass;

import java.util.*;

/**
 *
 * @author jihua5758
 */
public class SmartPhone {
    //fields
    private int apps;
    private ArrayList<String> appList;
    private String type;
    //constructor
    public SmartPhone() {
        appList = new ArrayList<String>();
        apps = 0;
        //choose random phone type
        if((int)(Math.random()*2 + 1)==1){
            type="Nokia";
        }else{
            type="Telephone";
        }
    }
    //alternate constructor
    public SmartPhone(String type) {
        appList = new ArrayList<String>();
        apps = 0;
        this.type=type;
    }
    //methods
    public void addApp(String appName){
        appList.add(appName);
        apps++;
    }
     public String toString() {
        String output="The following apps are installed on your "+type+":\n";
        for(int i = 0; i <apps; i++){
          output+="App #"+i+" - "+appList.get(i)+"\n";
        }
        return output;
    }
}

