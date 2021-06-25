/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevira.guided4b;

/**
 *
 * @author ACER
 */
public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }
    
    public String getType() {
        return "Rabbit";
    }

    public String playSound() {
        return "Squeak~!";
    }
}
    

