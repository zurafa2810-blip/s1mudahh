/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.s1;
import java.util.Scanner;

/**
 *
 * @author hamasawojajar
 */
public class S1 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
         int panjangBarang, tinggiBarang, lebarBarang;
        double beratBarang, hasilHarga, jarakBarang, tambahanHarga = 0, volumeBarang, hasilHargaJarak = 0;

        System.out.print("Masukkan panjang barang: ");
        panjangBarang = masukan.nextInt();

        System.out.print("Masukkan lebar barang: ");
        lebarBarang = masukan.nextInt();

        System.out.print("Masukkan tinggi barang: ");
        tinggiBarang = masukan.nextInt();

        System.out.print("Masukkan berat barang (kg): ");
        beratBarang = masukan.nextDouble();

        System.out.print("Masukkan jarak yang akan ditempuh barang (km): ");
        jarakBarang = masukan.nextDouble();

        volumeBarang = panjangBarang * tinggiBarang * lebarBarang;

        if (jarakBarang <= 10) {
            hasilHargaJarak = 4250; // tanpa titik ribuan, karena . digunakan untuk desimal
        } else if (jarakBarang > 10) {
            hasilHargaJarak = 6000;
        }

        if (volumeBarang > 100) {
            tambahanHarga = 50000;
        }

        hasilHarga = beratBarang * hasilHargaJarak + tambahanHarga;

        System.out.println("Harga untuk ekspedisi adalah: Rp " + hasilHarga);
    }
}
