/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Praktikum;

import java.util.Scanner;

/**
 *
 * 
 */
public class LuasBola {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan Jari - Jari :");
        float jrjr=masukan.nextFloat();
        
        System.out.println("Luas Bola = "+((3.14*jrjr*jrjr)*4));
    }
    
}
