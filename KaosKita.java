/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.kaoskita;

import java.util.Scanner;

/**
 *
 * @author NADIA
 */
public class KaosKita {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        int a, harga = 0;
        String mengulang;

        do {
            System.out.println("-----------------");
            System.out.println("Pilih ukuran baju pada kaos kita: ");
            System.out.println("1. XS");
            System.out.println("2. S");
            System.out.println("3. M");
            System.out.println("4. L");
            System.out.println("5. XL");
            System.out.println("6. XXL");
            System.out.println("Masukan pilihan ukuran baju ");
            a = input.nextInt();

            System.out.println("------------------");

            switch (a) {
                case 1:
                    System.out.println("Harga baju ukuran XS: ");
                    harga = 30000;
                    break;
                case 2:
                    System.out.println("Harga baju ukuran S: ");
                    harga = 35000;
                    break;
                case 3:
                    System.out.println("Harga baju ukuran M: ");
                    harga = 40000;
                    break;
                case 4:
                    System.out.println("Harga baju ukuran L: ");
                    harga = 45000;
                    break;
                case 5:
                    System.out.println("Harga baju ukuran XL: ");
                    harga = 50000;
                    break;
                case 6:
                    System.out.println("Harga baju ukuran XXL: ");
                    harga = 55000;
                    break;
                default:
                    System.out.println("MAAF UKURAN BAJU YANG ANDA MINTA TIDAK TERSEDIA DI MENU KAMI");
            }
            System.out.println("------------------");
            System.out.println("apakah anda yakin dengan ukuran tersebut?");
            mengulang = input.next();
        } while (mengulang.equals("tidak"));

        System.out.println("----------------------------------------------------");

        System.out.println("Masukkan Uang yang anda miliki = ");
        int uang = input.nextInt();
        int kembalian = uang - harga;

        System.out.println("----------------------------------------------------");

        if (uang > harga) {
            System.out.println("kembalian anda sebesar Rp" + kembalian + " terimakasih selamat berbelanja kembali");
        } else if (uang < harga) {
            System.out.println("maaf uang anda tidak mencukupi babayyy");

        }
    }
}
