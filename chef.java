/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guided5;

/**
 *
 * @author ACER
 */
public class chef {
    String name;
    
    // Constructor Chef
    public Chef(String name){
        this.name = name;
    }

    // Method cook original
    public void cook(){
        System.out.println("Chef" + name + "is cooking.");
    }

    // Method cook overloaded
    public void cook(String nameFood){
        System.out.println("Chef " + name + " is cooking "+ nameFood + ".");
    }
}


