/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal;

import java.util.Scanner;

/**
 *
 * @author maulana febriyanto
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;

        do {
            System.out.print("Masukan nilai mahasiswa: ");
            int nilai = input.nextInt();

            System.out.println("Nilai yang di input: " + nilai);

            System.out.print("Ingin input lagi? (y/t): ");
            pilihan = input.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y');
    }

}
