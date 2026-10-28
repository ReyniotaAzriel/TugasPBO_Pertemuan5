/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan5;

/**
 *
 * @author rizky
 */
public class Buku {
   String judul;
   String pengarang;
   int tahunTerbit;
   
   public Buku(String judul, String pengarang, int tahunTerbit){
       this.judul = judul;
       this.pengarang = pengarang;
       this.tahunTerbit = tahunTerbit;
   }
   
   void tampilkan(){
       System.out.println("Judul Buku : " + this.judul);
       System.out.println("Nama Pengarang: " + this.pengarang);
       System.out.println("Tahun Terbit Buku : " + this.tahunTerbit);
       
   }
}
