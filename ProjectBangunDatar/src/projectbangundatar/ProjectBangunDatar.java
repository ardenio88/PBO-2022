/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author arden
 */
public class ProjectBangunDatar {

    public static void main(String[] args) {
        PersegiPanjang A = new PersegiPanjang();
        A.panjang = 10;
        A.lebar = 10;

        A.hitungLuas();
        A.hitungKeliling();

        PersegiPanjang B = new PersegiPanjang();
        B.panjang = 14;
        B.lebar = 7;

        B.hitungLuas();
        B.hitungKeliling();

        PersegiPanjang C = new PersegiPanjang();
        C.panjang = 17;
        C.lebar = 8;

        C.hitungLuas();
        C.hitungKeliling();
        
        PersegiPanjang D = new PersegiPanjang();
        D.panjang = 26;
        D.lebar = 14;
        
        D.hitungLuas();
        D.hitungKeliling();
        
        Lingkaran L1 = new Lingkaran();
        L1.jejari = 6;
        
        L1.hitungLuas();
        L1.hitungKeliling();
        
        Lingkaran L2 = new Lingkaran();
        L2.jejari = 12;
        
        L2.hitungLuas();
        L2.hitungKeliling();
        
        
    }

}
