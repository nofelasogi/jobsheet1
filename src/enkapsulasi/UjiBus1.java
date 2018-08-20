/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enkapsulasi;

/**
 *
 * @author ZIDANE
 */
public class UjiBus1 {
    public static void main(String[]arg){
        
        
        //membuat objek busBesar dari class Bus
        Bus1 busBesar = new Bus1(40);
        busBesar.cetak();
        
        //penambahan penumpang 
        busBesar.addPenumpang(15);//menambahkan 15 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26);//menambahkan 26 penumpang
        busBesar.cetak();
    }
    
}
