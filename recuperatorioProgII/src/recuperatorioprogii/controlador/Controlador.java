
package recuperatorioprogii.controlador;

import java.util.ArrayList;
import java.util.List;
import recuperatorioprogii.modelo.Marca;
import recuperatorioprogii.modelo.Vehiculo;
import recuperatorioprogii.vista.Vista;


public class Controlador {

    public Controlador() {
    }
    
    Vista vista = new Vista();
    List <Marca> marcas = new ArrayList<>();
    List <Vehiculo> vehiculos = new ArrayList<>();
    public void iniciar(){
    
   
    int opcion;
   
    do{
        
    vista.mostrarMensaje("opcion 1: Igresar marcas");
    vista.mostrarMensaje("opcion 2: Igresar Vehiculo");
    vista.mostrarMensaje("opcion 3: Mostrar Vehiculo");
    vista.mostrarMensaje("Igrese 0 para salir");
    
    vista.mostrarMensaje("=================");
    opcion = vista.pedirNumero("Ingrese una opcion" + "\n" + "==================");
        
    switch(opcion){
        case 1:
            ingresarMarca();
            break;
        case 2:
            ingresarVehiculo();
            break;
        case 3:
            mostrarVehiculo();
            break;
        case 0:
            vista.mostrarMensaje("Gracias por utilizar el sistema");
            break;
        default:
            vista.mostrarMensaje("Opcion no valida");
            break;
    }
    }while(opcion !=0);
      
    }

    private void ingresarMarca() {
        vista.mostrarMensaje("==========================");
        vista.mostrarMensaje("Sistema de carga de marcas.");
        vista.mostrarMensaje("==========================");
        String marca = vista.pedirDato("Ingrese el nombre de la marca");
        marcas.add(new Marca(marca));
        vista.mostrarMensaje("Marca ingresada correctamente.");
    }

    private void ingresarVehiculo() {
        vista.mostrarMensaje("=============================");
        vista.mostrarMensaje("Sistema de carga de vehiculos.");
        vista.mostrarMensaje("=============================");
        for (Marca marca : marcas){
        vista.mostrarMensaje(marca.toString());
        }
        Marca marcaSeleccionada = null;
        int codigoSeleccionado = vista.pedirNumero("ingrese el codigo de la marca que desea asignar");
        for (Marca marca : marcas){
            if (marca.getCodigo()==codigoSeleccionado){
                marcaSeleccionada = marca;
            }
        }
        
        String nombre = vista.pedirDato("Ingrese el nombre del vehiculo");
        String modelo = vista.pedirDato("Ingrese el modelo");
        int año = vista.pedirNumero("Ingrese el año de fabricacion (formato dd/mm/aaaa)");
        vehiculos.add(new Vehiculo(nombre,modelo,marcaSeleccionada,año));
        vista.mostrarMensaje("Vehiculo ingresado correctamente.");
                
        }

    private void mostrarVehiculo() {
        vista.mostrarMensaje("==================================");
        vista.mostrarMensaje("Mostrando informacion de vehiculos.");
        vista.mostrarMensaje("==================================");
        for(Vehiculo vehiculo : vehiculos){
        vista.mostrarMensaje(vehiculo.toString());
        }
        }
    }
    
      
    
    

    
    


   


