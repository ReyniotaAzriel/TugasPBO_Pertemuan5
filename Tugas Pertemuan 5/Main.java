/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan5;

/**
 *
 * @author rizky
 */
public class Main {
    public static void main(String[] args) {
        //Tugas 1 kasus Constraktor
        Buku b1 = new Buku("Laut Bercerita", "Arif Edan", 2026);
        b1.tampilkan();

        System.out.println("");
        
        //Tugas 2 kasus Constractor overload
        Mobil m1 = new Mobil("Toyota", "Avanza");
        m1.tampilkan();
        Mobil m2 = new Mobil("Nissan", "Skyline R32", 1998);
        m2.tampilkan();
        
        System.out.println("");
        
        //Tugas 3 kasus Constractor overload
        Lingkaran l1 = new Lingkaran(0);
        l1.hitungLuas();
        System.out.println("");
        Lingkaran l2 = new Lingkaran(7);
        l2.hitungLuas();
        
        
    }
}
