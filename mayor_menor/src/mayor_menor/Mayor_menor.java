
package mayor_menor;

public class Mayor_menor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int a= leer.nextlnt();
        System.out.println("ingrese el segundo  numero: ");
        int b= leer.nextlnt();
        if (a>b) {
            System.out.println("el mayor= "+a+" el menor numero"+b);
        }   else {
            System.out.println("el mayor= "+b+" el menor numero"+a);
        }
    }
    
}
