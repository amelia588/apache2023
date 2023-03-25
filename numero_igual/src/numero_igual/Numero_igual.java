/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero_igual;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class Numero_igual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2;
        Scanner n=new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        num1=n.nextInt();
        System.out.println("intrudusca el segundo numero menor: ");
        num2=n.nextInt();
        if(num1>num2){
        System.out.println(num1 + "es mayor que" + num2);    
        }
        else{
            System.out.println(num2 + "es menor que" + num1);
            
        }
    }
    
}
