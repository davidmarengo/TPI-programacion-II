
package tpi.programacion.ii.vista;

import java.util.Scanner;



public class Vista {
    private Scanner scanner = new Scanner(System.in);

    public Vista() {
    }
    
    public void mostrarMenu(){
    
        //System.out.println("Seleccione la opcion que desea");
        System.out.println("Opcion 1: Generar Campeonato");
        System.out.println("Opcion 2: Generar Fecha");
        System.out.println("Opcion 3: Generar Partido");
        System.out.println("Opcion 4: Generar Equipo");
        System.out.println("Opcion 5: Generar Jugador");
        System.out.println("Opcion 6: Generar Director Tecnico");
        System.out.println("Opcion 7: Generar Entrenador Fisico");
        System.out.println("Opcion 8: Generar Medico");
        System.out.println("Opcion 9: Generar Arbitro");
        
    }
    
    public int pedirNumero(String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    
    
    public String pedirDato(String mensaje){
        System.out.println(mensaje);
        scanner.nextLine();
        return scanner.nextLine();
    }
    
    

}
