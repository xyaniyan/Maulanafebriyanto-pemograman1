/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author maulana febriyanto
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        System.out.print("Masukan Nilai: ");
        nilai = input.nextInt();

        if (nilai >= 75) {
            System.out.print("Lulus");

            int pilihan;
            System.out.println("Pilih Hadiah: ");
            System.out.println("1. Laptop");
            System.out.println("2. Smartphone");
            System.out.println("Masukan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Kamu mendapat Laptop");
                    break;
                case 2:
                    System.out.println("Kamu mendapat Smartphone");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        } else {
            System.out.print("Tidak lulus,Tidak mendapat hadiah");
        }
    }

}
