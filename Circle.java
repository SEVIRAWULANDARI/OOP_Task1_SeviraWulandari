/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevira.unguided5;

/**
 *
 * @author ACER
 */
public class Circle {
    int r;

    public Circle(int r) {
        this.r = r;
    }
    
   // @Override
    public float area(){
        return (float) (Math.PI * r * r);
    }
    
    //@Override
    public float circumference(){
        return (float) (2 * Math.PI * r);
    }
}

