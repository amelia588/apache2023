/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pares_while;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Pares_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cPares = 0, aux, numero;
        float sPares =0;
        System.out.pintln("ingresar el numero: ")
        numero = entreda.nexInt();
        aux = numero;
        while(aux >0){
            if( (aux % 10)%2 ==0){
                sPares=sPares + (aux %10);
                cPares = cPares + 1;
            }
            aux = aux/10;
        }
        System.out.println("\nEl promedio de los numeros pares es: "+(sPares/cPares));
    }
   
    
}
