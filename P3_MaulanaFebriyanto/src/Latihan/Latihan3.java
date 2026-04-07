/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author maulana febriyanto
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      BufferedReader data = new BufferedReader(
                new InputStreamReader(System.in));

        String nama;

        System.out.print("Masukkan Nama : ");
        nama = data.readLine();

        System.out.println("Nama anda : " + nama);
    }
    
}
