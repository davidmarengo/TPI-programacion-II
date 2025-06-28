
package tpi.programacion.ii.vista;

import java.util.Scanner;



public class Vista {
    private Scanner scanner = new Scanner(System.in);

    public Vista() {
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
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public void mostrarMenuPrincipal() {
        System.out.println("Opcion 1:Ingresar al menu para cargar datos");
        System.out.println("Opcion 2:Ingresar al menu para mostrar informacion");
        System.out.println("Opcion 0:Salir del sistema");
        
    }

    public void mostrarMenuInformacion() {
         System.out.println("Opcion 1: Generar Campeonato");
        System.out.println("Opcion 2: Generar Fecha");
        System.out.println("Opcion 3: Generar Partido");
        System.out.println("Opcion 4: Generar Equipo");
        System.out.println("Opcion 5: Generar Jugador");
        System.out.println("Opcion 6: Generar Director Tecnico");
        System.out.println("Opcion 7: Generar Entrenador Fisico");
        System.out.println("Opcion 8: Generar Medico");
        System.out.println("Opcion 9: Generar Arbitro");
        System.out.println("Opcion 0: Volver al menu principal");
    }

    public void mostrarMenuDatos() {
        System.out.println("Opcion 1: Mostrar informacion del campeonato");
        System.out.println("Opcion 2: Mostrar informacion de equipos");
    }

}
