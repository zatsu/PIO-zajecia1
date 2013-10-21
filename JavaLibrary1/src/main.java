/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zatsu
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CD cd1 = new CD();
        cd1.setTitle("jabuszko");
        cd1.setYear(1990);
        AudioCD cd = new AudioCD();
        System.out.println(cd1);
    }
    
}
