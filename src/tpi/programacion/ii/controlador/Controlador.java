
package tpi.programacion.ii.controlador;

import tpi.programacion.ii.vista.Vista;



public class Controlador {

    public Controlador() {
    }
    
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
                    generarCampeoonato();
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
                case 0:
                    vista.mostrarMensaje("Volviendo al menú principal...");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida.");
            }
        } while (opcion != 0);
    }

    // Métodos simulados para cargar datos
    private void generarCampeoonato() {
    }
    
    private void generarFecha() {
    }
    
    private void generarPartido() {
    }
    
    private void generarEquipo() {
    }
    
    private void generarJugador() {
    }
    
    private void generarDirectorTecnico() {
    }
    
    private void generarEntrenadorFisico() {
    }
    
    private void generarMedico() {
    }
    
    private void generarArbitro() {
    }

    private void mostrarCampeonato() {
    }

    private void mostrarEquipos() {
    }

   }

