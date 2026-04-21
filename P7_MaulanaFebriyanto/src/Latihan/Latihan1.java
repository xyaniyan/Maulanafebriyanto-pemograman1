/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan;
import java.util.Objects;
import java.util.Scanner;
/**
 *
 * @author maulana febriyanto
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer pilihan =0;
        String Nama="";
        String jurusan="";
        String reg="";
        int pilihreg=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan pilihan jurusan: ");
        pilihan=input.nextInt();
        input.nextLine();
        
       if(pilihan==1){
         
         System.out.println("Masukan nama: ");
         Nama=input.nextLine();
         jurusan="TI";
         
         System.out.println("1= REG A");
         System.out.println("2= REG B");
         System.out.println("3= REG CK");
         System.out.println("4= REG CS");
         System.out.println("5= REG Default");
         System.out.println("Masukan Pilihan REG");
         pilihreg=input.nextInt();
         
         switch(pilihreg){
             case 1:reg=" REG A";
                 break;
             case 2:reg="regB";
                 break;
             case 3:reg="CK";
                 break;  
             case 4:reg="CS";
                 break;  
             default:reg="A";
                 break;    
         }
         
         
         
        }else{
           System.out.println("Keluar");
           return;
        }   System.out.println(Nama + " "+jurusan + reg); 
    }
}