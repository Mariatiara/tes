/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setigia.angka;

/**
 *
 * @author TIARA
 */
import java.util.Scanner;
public class SetigiaAngka {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Segitiga Angka");
        System.out.print("Masukan N : ");
        int N = s.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(""+j);
            }
            System.out.println("");
        }
    }
    
}
