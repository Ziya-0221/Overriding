/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author indi
 */
public class Anaknya extends Overriding {
    
    //override dari kelas Overriding
    @Override
    String karnivora(){
        String hewan = "Harimau";
        String makan = "Daging";
        String jumlah = "3 ekor";
        System.out.println("====="+hewan+"=====");
        System.out.println("Nama Hewan: "+hewan);
        System.out.println("Makanan : "+makan);
        System.out.println("Jumlah : "+ jumlah);
        return hewan;
    }
    
    @Override
    String herbivora(){
        String hewan = "Kambing";
        String makan = "Rumput";
        String jumlah = "r ekor";
        System.out.println("====="+hewan+"=====");
        System.out.println("Nama Hewan: "+hewan);
        System.out.println("Makanan : "+makan);
        System.out.println("Jumlah : "+ jumlah);
        return hewan;
    }

   
}
