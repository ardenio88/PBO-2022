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
public class CekTriple {
    Scanner input = new Scanner(System.in);
    double a;
    double b;
    double c;
    String check(){
        System.out.print("Masukkan nilai a: ");
        this.a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        this.b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        this.c = input.nextDouble();
        System.out.println("");
        if ((c * c) == ((a * a) + (b * b))){
            return "Segitiga anda triple pythagoras";
        }
        else{
            return "Segitiga anda tidak termasuk triple pythagoras";
        }
    }
    
    
}
