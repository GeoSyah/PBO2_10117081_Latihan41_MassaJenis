/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan41_massajenis;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Menghitung dan memperlihatkan hasil volume dan massa jenis
 *                  dari sisi dan massa
 */
public class PBO2_10117081_Latihan41_MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Kubus cube = new Kubus();

        System.out.println("=== Massa Janes Kubus ===");
        System.out.print("Sisi \t: ");
        cube.setSisi(scn1.nextInt());
        System.out.print("Massa \t: ");
        cube.setMassa(scn1.nextInt());

        System.out.println("\n===Hasil Perhitungan===");
        System.out.println("Volume \t: "+cube.hitungVolume(cube.getSisi()));
        System.out.println("Massa Jenis : "+cube.hitungMassaJenis(cube.getMassa()
                , cube.hitungVolume(cube.getSisi())));
    }
    
}
