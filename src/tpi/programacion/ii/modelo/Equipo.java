
package tpi.programacion.ii.modelo;

import java.util.ArrayList;
import java.util.List;
import tpi.programacion.ii.modelo.Persona.DirectorTecnico;
import tpi.programacion.ii.modelo.Persona.EntrenadorFisico;
import tpi.programacion.ii.modelo.Persona.Jugador;
import tpi.programacion.ii.modelo.Persona.Medico;



public class Equipo {
    private int contadorEquipo = 1;
    private int codigo;
    private String nombre;
    private DirectorTecnico directorTecnico;
    private Medico medico;
    private EntrenadorFisico entrenadorFisico;
    private List<Jugador>jugadores = new ArrayList<>();
    private String estado;

}
