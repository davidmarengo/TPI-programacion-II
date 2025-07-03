
package recuperatorioprogii.vista;

import java.util.Scanner;

import java.util.Scanner;

public class Vista {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
        System.out.println();
    }

    public int pedirNumero(String mensaje) {
        System.out.println(mensaje);
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }

    public String pedirDato(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }
}

    
    
    
    
    

