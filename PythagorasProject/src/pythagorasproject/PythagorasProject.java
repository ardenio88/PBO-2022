/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pythagorasproject;

/**
 *
 * @author WINDOWS 11
 */
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu select = new Menu();
        
        
        while (true) {            
            select.menuPilih();
            String option = select.pemilihan();
            select.menuPilih(option);
            }
        }
        
    }
