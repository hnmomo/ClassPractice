/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creatingclass;

/**
 *
 * @author jihua5758
 */
public class Dog {
    //fields
    private String name,colour;
    private int iq,age;
    /**Alternate constructor.
     * post:dog named Cat with rainbow color 0 IQ and 9999 age.
     */
    public Dog(){
        this("Cat","rainbow",0,9999);
    }
    /**Alternate constructor.
     * post:dog have random IQ and age.
     */
    public Dog(String name,String colour){
        this(name,colour,(int)(Math.random()*100)+1,(int)(Math.random()*10)+1);
    }
    /**constructor.
     * post:dog features as input.
     */
    public Dog(String name,String colour,int iq,int age){
        this.name=name;
        this.colour=colour;
        this.iq=iq;
        this.age=age;
    }
    //method declarations
    /**output dog laughing message.
     * post:print dog laughing message.
     */
    public void laughAtYou(){
        System.out.println(name+" laguhs at you,\"Stupid human.\"");
    }
    public void barkWisely(){
        System.out.println(name+" thinks deeply,\"Life.\"");
    }
    /**turn dog object into string.
     * post:return dog information.
     */
    public String toString(){
        String output=name+" is a(n) "+colour+" dog "+"with an iq of "+iq+".\n";
        output+="he is "+age+" years old";
        return output;
    }
}
