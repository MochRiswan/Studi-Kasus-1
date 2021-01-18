/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Segitiga {
    Scanner I = new Scanner(System.in);
    int a;
    int t;
    double h;
    
    void input(){
        System.out.print("Masukkan alas\t= ");
        a = I.nextInt();
        System.out.print("Masukkan tinggi\t= ");
        t = I.nextInt();
    }
    double hitung(){
        h = (0.5*a*t);
        return h;
    }
    double hasil(){
        System.out.print("Hasil\t\t= ");
        return h;
    }
}
