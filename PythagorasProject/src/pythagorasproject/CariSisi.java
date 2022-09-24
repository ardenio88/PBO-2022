/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pythagorasproject;

/**
 *
 * @author WINDOWS 11
 */
import java.util.Scanner;
import java.lang.Math;
public class CariSisi {
    Scanner input = new Scanner(System.in);

    
    double a;
    double b;
    double c;
    String sisiMiring(){
        System.out.print("Masukkan nilai a: ");
        this.a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        this.b = input.nextDouble();
        this.c = Math.sqrt((Math.pow(a,2) + (Math.pow(b,2))));
        return "Sisi Miring : " + c;
    }
    
    String sisiSiku(){
        System.out.print("Masukkan nilai a: ");
        this.a = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        this.c = input.nextDouble();
        this.b = Math.sqrt((Math.pow(c,2) - (Math.pow(a,2))));
        return "Sisi Siku-siku : " + b;
    }
    
    
}
