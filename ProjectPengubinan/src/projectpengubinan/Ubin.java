/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpengubinan;

/**
 *
 * @author arden
 */
public class Ubin {

//    int panjang;
//    int lebar;
//
//    double hitungLuas() {
//        PersegiPanjang u = new PersegiPanjang();
//        u.panjang = this.panjang;
//        u.lebar = this.lebar;
//        return u.hitungLuas();
    
    int panjang;
    int lebar;
    
    double hitungLuas(){
        PersegiPanjang u = new PersegiPanjang();
        return u.hitungLuas(this.panjang, this.lebar);
    }
}
