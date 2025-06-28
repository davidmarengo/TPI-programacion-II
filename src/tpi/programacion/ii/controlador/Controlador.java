
package tpi.programacion.ii.controlador;

import tpi.programacion.ii.vista.Vista;



public class Controlador {

    public Controlador() {
    }
    
    Vista vista = new Vista();

    public void iniciar(){
    
        int menu = 0;
        
        do {
            
        
          vista.mostrarMenu();
         menu = vista.pedirNumero("Ingrese la oppcion que desea");
    
        switch(menu){
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
                vista.mostrarMensaje("Gracias");
                break;
            default:
                break;
                   
        
        }
            
        }while (menu !=0);
    
    
    
    
    }

    private void generarCampeoonato() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generarFecha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generarPartido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generarArbitro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generarMedico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generarEntrenadorFisico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generarDirectorTecnico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generarJugador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void generarEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
