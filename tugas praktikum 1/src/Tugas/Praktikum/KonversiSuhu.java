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
public class KonversiSuhu {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        System.out.println("Pilih Jenis Suhu :");
        String jenis = masukan.next();
        int c = 78;
        switch(jenis){
            case "F" :
                System.out.println("Fahrenheit :"+(c*1.8+32));
                break;
            case "R" :
                System.out.println("Reamur :"+(0.8*c));
                break;
            case "K" :
                System.out.println("Kelvin :"+(c+273));
        }
    }
}    
    

