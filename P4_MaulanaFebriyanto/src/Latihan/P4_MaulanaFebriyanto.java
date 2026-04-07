/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan;
import java.util.Scanner;

/**
 *
 * @author maulana febriyanto
 */
public class P4_MaulanaFebriyanto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Kehadiran, B_Kehadiran;
        float Tugas, B_Tugas;
        float UTS, B_UTS;
        float UAS, B_UAS;
        int Real = 21 ;
        float Total;
        
        System.out.print("Real(default):" + Real);
        System.out.print("Input Kehadiran: ");
        Kehadiran = input.nextFloat();
        System.out.print("Input Tugas: ");
        Tugas = input.nextFloat();
        System.out.print("Input UTS: ");
        UTS = input.nextFloat();
        System.out.print("Input UAS: ");
        UAS = input.nextFloat();
        
        B_Kehadiran = (Kehadiran/Real) * 10;
        B_Tugas = Tugas * 20 / 100;
        B_UTS = UTS * 30 / 100;
        B_UAS = UAS * 40 / 100;
        
        Total = B_Kehadiran + B_Tugas + B_UTS + B_UAS;
        
        System.out.println("\n===== HASIL =====");
        System.out.println("Real: " + Real);
        System.out.println("Kehadiran: " + Kehadiran);
        System.out.println("Tugas: " + Tugas);
        System.out.println("UTS: " + UTS);
        System.out.println("UAS: " + UAS);
        System.out.println("Total: " + Total);
        
    }
    
}
