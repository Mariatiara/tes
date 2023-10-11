/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor;

/**
 *
 * @author TIARA
 */
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Input N = ");
        int N = s.nextInt();
        for (int i = 1; i <= N; i+=2) {
            System.out.println(""+i);
        }
    }
    
}
