/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;

/**
 *
 * @author MOKLET-2
 */
public class Studikasus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Luas Segitiga");
        Segitiga tiga = new Segitiga();
        tiga.input();
        tiga.hitung();
        
        System.out.println(tiga.hasil());
    }
    
}
