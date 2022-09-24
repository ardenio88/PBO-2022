/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectluasbangunkompleks;

/**
 *
 * @author arden
 */
public class ProjectLuasBangunKompleks {

    public static void main(String[] args) {
        Persegi X = new Persegi();
        X.sisi = 42;
        var luasX = X.hitungLuas();
        
        Lingkaran Y = new Lingkaran();
        Y.jari = 21;
        var luasY = Y.hitungLuas();
        
        var totalLuas = luasX + ( luasY * 2);
        System.out.println(("Total luas bangunan project 1 adalah : ") + totalLuas + " cm2");
        
//        Lingkaran A = new Lingkaran();
//        A.jari = 14;
//        var luasA = A.hitungLuas() / 2;
//        
//        Lingkaran B = new Lingkaran();
//        B.jari = 7;
//        var luasB = B.hitungLuas();
//        
//        var luasTotal = luasA - luasB;
//        System.out.println(("Total Luas bangunan yang berwarna abu-abu adalah : ") + luasTotal);
    }
}
