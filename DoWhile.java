/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgdo.pkgwhile;

/**
 *
 * @author TIARA
 */
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Do while bilangan ganjil");
        System.out.print("Masukan N = ");
        int N = s.nextInt();
        System.out.println("Deret angka ganjil :");
        int v = 1;
        do{
                System.out.println(v + " ");
                v += 2;
        } while (N >= v);
    }
    
}
