/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevira.unguided3;

/**
 *
 * @author ACER
 */
public class Game {
    public static void main(String[] args){

        // membuat objek player
        Player permainan = new Player();

        // mengisi atribut player
        permainan.name = "Sevira";
        permainan.speed = 70;
        permainan.healthPoin = 100;

        // menjalankan method
        permainan.run();

        if(permainan.isDead()){
            System.out.println("Game Over!");
        }
   }
 
}


