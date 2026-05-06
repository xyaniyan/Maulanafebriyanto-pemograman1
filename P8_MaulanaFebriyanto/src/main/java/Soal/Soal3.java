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
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;
        int total = 0;
        int jumlahData = 0;

        do {
            System.out.print("Masukan nilai mahasiswa: ");
            int nilai = input.nextInt();

            total += nilai;
            jumlahData++;

            System.out.print("Ingin input Lagi? (y/t): ");
            pilihan = input.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y');

        double rataRata = (jumlahData > 0) ? (double) total / jumlahData : 0;

        System.out.println("Rata-Rata nilai: " + rataRata);
    }

}
