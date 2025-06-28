
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
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                
                break;
            case 8:
                break;
            case 9:
                break;
            case 0:
                break;
            default:
                break;
                   
        
        }
            
        }while (menu !=0);
    
    
    
    
    }
}
