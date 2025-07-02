
package tpi.programacion.ii.controlador;

import java.util.ArrayList;
import java.util.List;
import tpi.programacion.ii.modelo.Equipo;
import tpi.programacion.ii.modelo.Persona.Arbitro;
import tpi.programacion.ii.modelo.Persona.Jugador;
import tpi.programacion.ii.vista.Vista;



public class Controlador {

    public Controlador() {
    }
    
    List<Jugador>jugadores = new ArrayList<>();
    List<Equipo>Equipos = new ArrayList<>();
    
    Vista vista = new Vista();

    public void iniciar(){
        
    
        //MENU PRINCIPAL
        int opcionPrincipal;

        do {
            vista.mostrarMenuPrincipal();
            opcionPrincipal = vista.pedirNumero("Seleccione una opción:");

            switch (opcionPrincipal) {
                case 1:
                    menuMostrarInformacion();
                    break;
                case 2:
                    menuCargarDatos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcionPrincipal != 0);
    }

    // SUBMENU CARGAR DATOS
    private void menuCargarDatos() {
        int menu;
        do {
            vista.mostrarMenuDatos();
            menu = vista.pedirNumero("Ingrese la opción que desea:");

            switch (menu) {
                case 1:
                    generarCampeonato();
                    break;
                case 2:
                    generarFecha();
                    break;
                case 3:
                    generarPartido();
                    break;
                case 4:
                    generarEquipo();
                    break;
                case 5:
                    generarJugador();
                    break;
                case 6:
                    generarDirectorTecnico();
                    break;
                case 7:
                    generarEntrenadorFisico();
                    break;
                case 8:
                    generarMedico();
                    break;
                case 9:
                    generarArbitro();
                    break;
                case 0:
                    vista.mostrarMensaje("Volviendo al menú principal...");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida. Intente nuevamente.");
            }
        } while (menu != 0);
    }

    // SUBMENU MOSTRAR INFORMACIÓN
    private void menuMostrarInformacion() {
        int opcion;
        do {
            vista.mostrarMenuInformacion();
            opcion = vista.pedirNumero("Seleccione una opción:");

            switch (opcion) {
                case 1:
                    mostrarCampeonato();
                    break;
                case 2:
                    mostrarEquipos();
                    break;
                case 3:
                    mostrarJugadores();
                    break;
                case 0:
                    vista.mostrarMensaje("Volviendo al menú principal...");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida.");
            }
        } while (opcion != 0);
    }

    // METODOS PARA CARGAR DATOS
    private void generarCampeonato() {
    }
    
    private void generarFecha() {
    }
    
    private void generarPartido() {
    }
    
    private void generarEquipo() {
    }
    
    private void generarJugador() {
        String nombre = vista.pedirDato("Ingrese el nombre");
        String apellido = vista.pedirDato("Ingrese el apellido");
        String direccion = vista.pedirDato("Ingrese la direccion. Formato calle y numero");
        int DNI = vista.pedirNumero("Ingrese el D.N.I.");
        String fechaNacimiento = vista.pedirDato("Ingrese la fecha de nacimiento. Formato dia, mes y año");
        int matricula = vista.pedirNumero("Ingrese el numero de matricula");
        jugadores.add(new Jugador(nombre,apellido,direccion,DNI,fechaNacimiento,matricula));
    }
    
    private void generarDirectorTecnico() {
        String nombre = vista.pedirDato("Ingrese el nombre");
        String apellido = vista.pedirDato("Ingrese el apellido");
        String direccion = vista.pedirDato("Ingrese la direccion. Formato calle y numero");
        int DNI = vista.pedirNumero("Ingrese el D.N.I.");
        String fechaNacimiento = vista.pedirDato("Ingrese la fecha de nacimiento. Formato dia, mes y año");
    }
    
    private void generarEntrenadorFisico() {
        String nombre = vista.pedirDato("Ingrese el nombre");
        String apellido = vista.pedirDato("Ingrese el apellido");
        String direccion = vista.pedirDato("Ingrese la direccion. Formato calle y numero");
        int DNI = vista.pedirNumero("Ingrese el D.N.I.");
        String fechaNacimiento = vista.pedirDato("Ingrese la fecha de nacimiento. Formato dia, mes y año");
    }
    
    private void generarMedico() {
        String nombre = vista.pedirDato("Ingrese el nombre");
        String apellido = vista.pedirDato("Ingrese el apellido");
        String direccion = vista.pedirDato("Ingrese la direccion. Formato calle y numero");
        int DNI = vista.pedirNumero("Ingrese el D.N.I.");
        String fechaNacimiento = vista.pedirDato("Ingrese la fecha de nacimiento. Formato dia, mes y año");
    }
    
    private void generarArbitro() {
        String nombre = vista.pedirDato("Ingrese el nombre");
        String apellido = vista.pedirDato("Ingrese el apellido");
        String direccion = vista.pedirDato("Ingrese la direccion. Formato calle y numero");
        int DNI = vista.pedirNumero("Ingrese el D.N.I.");
        String fechaNacimiento = vista.pedirDato("Ingrese la fecha de nacimiento. Formato dia, mes y año");
        
        new Arbitro();
    }
    
    
    //METODOS PARA MOSTRAR INFORMACION
    private void mostrarCampeonato() {
    }

    private void mostrarEquipos() {
        vista.mostrarLista(Equipos);
    }
    
    private void mostrarJugadores() {
        vista.mostrarLista(jugadores);
    }

   }

