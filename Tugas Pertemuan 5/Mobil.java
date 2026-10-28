/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan5;

/**
 *
 * @author rizky
 */
public class Mobil {
    String merkMobil;
    String modelMobil;
    int tahun;
    
    public Mobil(String merkMobil, String modelMobil){
        this.merkMobil = merkMobil;
        this.modelMobil = modelMobil;
        this.tahun = 2025;
    }
    
    public Mobil(String merkMobil, String modelMobil, int tahun){
        this.merkMobil = merkMobil;
        this.modelMobil = modelMobil;
        this.tahun = tahun;
    }
    
    void tampilkan(){
        System.out.println("Merk Mobil : " + this.merkMobil);
        System.out.println("Model Mobil : " + this.modelMobil);
        System.out.println("Tahun : " + this.tahun);
        
    }
    
}
