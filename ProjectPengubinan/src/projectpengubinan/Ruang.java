/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpengubinan;

/**
 *
 * @author arden
 */
public class Ruang {

//    int panjang;
//    int lebar;
//
//    int hitungLuas() {
//        PersegiPanjang p = new PersegiPanjang();
//        p.panjang = this.panjang;
//        p.lebar = this.lebar;
//
//        return p.hitungLuas();
    
    int panjang;
    int lebar;
    
    int hitungLuas(){
        PersegiPanjang p = new PersegiPanjang();
        return p.hitungLuas(this.panjang, this.lebar);
    }
}
