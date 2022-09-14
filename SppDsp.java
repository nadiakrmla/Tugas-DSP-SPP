/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sppdsp;

import java.util.Scanner;

/**
 *
 * @author NADIA
 */
public class SppDsp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        String jalur,golongan;
        System.out.println("Jalur: ");
        System.out.println("SBMPTN");
        System.out.println("SNMPTN");
        System.out.println("Mandiri");
        System.out.println("-----------------");
        System.out.println("Masukan jalur: ");
        jalur = input.nextLine();
        System.out.println("Golongan Pendapatan");
        golongan = input.nextLine();
        
        if(jalur.equals("SBMPTN")){
            if(golongan.equals("A")){
                System.out.println("DSP:Rp 5.000.000");
                System.out.println("SPP:Rp 500.000");
            }
            if(golongan.equals("B")){
                System.out.println("DSP:Rp 15.000.000");
                System.out.println("SPP:Rp 1.000.000");
            }
            if(golongan.equals("C")){
                System.out.println("DSP:Rp 30.000.000");
                System.out.println("SPP:Rp 2.000.000");
            }
        }
        if(jalur.equals("SNMPTN")){
            if(golongan.equals("A")){
                System.out.println("DSP:Rp 7.000.000");
                System.out.println("SPP:Rp 500.000");
            }
            if(golongan.equals("B")){
                System.out.println("DSP:Rp 17.000.000");
                System.out.println("SPP:Rp 1.000.000");
            }
            if(golongan.equals("C")){
                System.out.println("DSP:Rp 35.000.000");
                System.out.println("SPP:Rp 2.000.000");
            }
        }
        if(jalur.equals("MANDIRI")){
            if(golongan.equals("A")){
                System.out.println("DSP:Rp 10.000.000");
                System.out.println("SPP:Rp 1.000.000");
            }
            if(golongan.equals("B")){
                System.out.println("DSP:Rp 25.000.000");
                System.out.println("SPP:Rp 2.000.000");
            }
            if(golongan.equals("C")){
                System.out.println("DSP:Rp 50.000.000");
                System.out.println("SPP:Rp 3.000.000");
            }
        }
    }
}
