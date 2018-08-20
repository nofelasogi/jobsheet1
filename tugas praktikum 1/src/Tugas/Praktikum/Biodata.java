/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Praktikum;

import java.util.Scanner;

/**
 *
 * @author ZIDANE
 */
public class Biodata {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        String nama, tl, jk, almt, moto;
        int nis, tgl;
        System.out.println("Biodata");
        System.out.println();
        System.out.print("Nama : ");
        nama = masukan.nextLine();
        System.out.print("NIS : ");
        nis = masukan.nextInt();
        System.out.print("Tempat Lahir : ");
        tl = masukan.nextLine();
        System.out.print("Tanggal Lahir : ");
        tgl = masukan.nextInt();
        System.out.println("Jenis Kelamin : ");
        jk = masukan.nextLine();
        System.out.print("Alamat di Malang : ");
        almt=masukan.nextLine();
        System.out.println("Motto : ");
        moto=masukan.next();
        
        
    }
    
}
