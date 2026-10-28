/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan5;

/**
 *
 * @author rizky
 */
public class Lingkaran {
    double jari;
    
    public Lingkaran(double jari){
        this.jari = jari;
    }
    
    void hitungLuas(){
        if(jari <= 0){
            jari = 1.0;
            System.out.println("Jari jari : "+ jari);
            System.out.println("Luas Lingkaran : " + jari * jari * 3.14);
        }else{
            
            System.out.println("Jari jari : "+ jari);
            System.out.println("Luas Lingkaran : " + jari * jari * 3.14);
        }
    }
}
