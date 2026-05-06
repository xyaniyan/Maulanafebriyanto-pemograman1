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
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        
        do{
        System.out.print("Nama : ");
        String nama = input.nextLine();
        
        System.out.print("NIM : ");
        String nim = input.nextLine();
        
        System.out.println("Data: " + nama+" - "+ nim);
        
        System.out.print("Ulangi? (y/t): ");
        ulang = input.next().charAt(0);
        input.nextLine();
        
        } while (ulang == 'y' || ulang == 'Y');
    }
    
}
