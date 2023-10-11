/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

/**
 *
 * @author TIARA
 */
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Masukan Bilangan = ");
        int n = s.nextInt();
        int x = 1;
        while (x <= n){
            System.out.println(""+ x);
            x +=2;
        }
    } 
    
}
