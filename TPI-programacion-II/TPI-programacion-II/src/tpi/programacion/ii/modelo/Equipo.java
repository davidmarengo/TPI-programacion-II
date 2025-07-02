
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

    public Equipo() {
    }

    public Equipo(int codigo, String nombre, DirectorTecnico directorTecnico, Medico medico, EntrenadorFisico entrenadorFisico, String estado) {
        this.codigo = contadorEquipo;
        contadorEquipo ++;
        this.nombre = nombre;
        this.directorTecnico = directorTecnico;
        this.medico = medico;
        this.entrenadorFisico = entrenadorFisico;
        this.estado = estado;
    }

   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DirectorTecnico getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(DirectorTecnico directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public EntrenadorFisico getEntrenadorFisico() {
        return entrenadorFisico;
    }

    public void setEntrenadorFisico(EntrenadorFisico entrenadorFisico) {
        this.entrenadorFisico = entrenadorFisico;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Equipo{" + "codigo=" + codigo + ", nombre=" + nombre + ", directorTecnico=" + directorTecnico + ", medico=" + medico + ", entrenadorFisico=" + entrenadorFisico + ", jugadores=" + jugadores + ", estado=" + estado + '}';
    }
    
    
    
    

}
