/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk mengeja nama
 */
public class PBOIF210119053Latihan25EjaanNama {
    
    public static void ejaan(String nama, int jumlahKarakter){
        for (int i = 0; i<jumlahKarakter; i++) {
            char eja = nama.charAt(i);
            int no = i+1;
            System.out.println("Huruf ke-" + no + " : " + eja);
        }
    }
    
    public static void main(String[] args) {
        String nama;
        int jumlahKarakter;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk dieja : ");
        nama = input.next();
        jumlahKarakter = nama.length();
        System.out.println("");
        System.out.println("Ejaan untuk " + "'" + nama + "'" + " adalah :");
        ejaan(nama,jumlahKarakter);
        }
    
}
