
package tpi.programacion.ii.modelo;

import java.util.ArrayList;
import java.util.List;



public class Campeonato {
    
    private static int contadorCampeonatos = 1;
    private int codigo;
    private String Nombre;
    private int temporada;
    List<Partido> partidos = new ArrayList<>();
    private String estado;

    public Campeonato() {
    }

    public Campeonato(int codigo, String Nombre, int temporada, String estado) {
        this.codigo = contadorCampeonatos;
        contadorCampeonatos ++;
        this.Nombre = Nombre;
        this.temporada = temporada;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Campeonato{" + "codigo=" + codigo + ", Nombre=" + Nombre + ", temporada=" + temporada + ", partidos=" + partidos + ", estado=" + estado + '}';
    }
    
     

    
    
    
    
    
}
