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
public class Menu {
    Scanner input = new Scanner(System.in);
    String pilihan;
    void menuPilih(){
        System.out.println("1. Cek triple pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga");
        System.out.println("3. Menentukan sisi siku-siku segitiga");
        System.out.println("4. Exit");
    }
    String pemilihan(){
        System.out.print("Masukkan Pilihan : ");
        this.pilihan = input.nextLine();
        System.out.println("");
        return pilihan;
    }
    void menuPilih(String x){
        Output out = new Output();
        switch (x) {
            case "1" -> {
                out.cetakTripel();
            }
            case "2" -> {
                out.cetakSisiMiring();
            }
            case "3" -> {
                out.cetakSisiSiku();
            }
            case "4" -> {
                System.out.println("adios");
                System.exit(0);
            }
            default -> System.out.println("Mohon pilih Menu");
        }
    }
    
    
}
