/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero_impar;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class Numero_impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int contImpar = 0;
        int contPar = 0;
        String resp;
        do {
            System.out.println("ingrese un numero: ");
            int num = sc.nextInt();
            if(num % 2 == 1){
                contImpar++;    
            }else{
                contPar++;
            }
            System.out.println("¿Desea continuar si o no ? ");
            resp = sc.nextLine();
        }while(resp.equals("si"));
        System.out.println("La cantidad de pares es: "+ contPar);
        System.out.println("La cantidad de impares: "+contImpar);


    }
}
    