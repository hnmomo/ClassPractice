/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creatingclass;

import javax.swing.*;

/**
 *
 * @author jihua5758
 */
public class CreatingClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create my dog objects with astonishing features
        Dog dog1 = new Dog("Rover", "red", 8, 4);
        Dog dog2 = new Dog("Spot", "purple");
        Dog dog3 = new Dog();
        //output my dog info
        System.out.println(dog1.toString());
        System.out.println("--------------------------");
        System.out.println(dog2.toString());
        System.out.println("--------------------------");
        System.out.println(dog3);
        System.out.println("--------------------------");
        //dog1 laughs at you and dog3 thinks about life
        dog1.laughAtYou();
        dog3.barkWisely();
        //ask for phone type
        String choice=JOptionPane.showInputDialog("Creating SmartPhone object:\n1 - Enter the type of smartphone you own\n2 - Generate a random smartphone");
        SmartPhone sp;
        if(choice.equals("2")){
            sp=new SmartPhone();
        }else if(choice.equals("1")) {
            String type=JOptionPane.showInputDialog("What type of phone do you own?\nFor example: iPhone");
            sp=new SmartPhone(type);
        }else{
            System.out.println("Invalid selection!Generating random smartphone.");
            sp=new SmartPhone();
        }
        //menu for adding apps
        boolean done = false;
        String myApp;
        while(!done) {
            myApp = JOptionPane.showInputDialog("Please type the name of an app to add to your phone.\nType DONE when finished\nYOU CANNOT REMOVE APPS!!!");
            if(myApp.equalsIgnoreCase("done")){
                done=true;
            }else{
                sp.addApp(myApp);
            }
        }
        //output phone info
        JOptionPane.showMessageDialog(null, sp);
    }
}
