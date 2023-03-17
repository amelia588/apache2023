/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing_lf;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class Testing_lf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String nombre = name.nextLine();
        System.out.println("¡Hello" + nombre +  "!");
        System.out.println("ingrese un número: ");
        //*************************************
        int num = name.nextInt();
         System.out.println("El valor que ingresastes es: ");
         //algoritmo if
         if (num > 10) {
             System.out.println("Hello" + nombre+" "+" tu número es menor que 10   es: ");
         }
        else if (num == 10){
                     System.out.println("Hello" + nombre+" "+" tu número es igual que 10   es: ");
        }
        else{
             System.out.println("Hello" + nombre+" "+" tu número es mayor que 10   es: ");
                     
                    
                     
         }
    }
    
}
