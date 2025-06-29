
package tpi.programacion.ii.modelo;

import tpi.programacion.ii.modelo.Persona.Arbitro;



public class Partido {
    private int contadorPartidos = 1;
    private int codigo;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Fecha fecha;
    private String locacion;
    private Arbitro arbitro;
    private int puntosLocal;
    private int puntosVisitate;
    private String estado;

    public Partido() {
    }

    public Partido(int codigo, Equipo equipoLocal, Equipo equipoVisitante, Fecha fecha, String locacion, Arbitro arbitro, int puntosLocal, int puntosVisitate, String estado) {
        this.codigo = contadorPartidos;
        contadorPartidos ++;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.locacion = locacion;
        this.arbitro = arbitro;
        this.puntosLocal = puntosLocal;
        this.puntosVisitate = puntosVisitate;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public int getPuntosLocal() {
        return puntosLocal;
    }

    public void setPuntosLocal(int puntosLocal) {
        this.puntosLocal = puntosLocal;
    }

    public int getPuntosVisitate() {
        return puntosVisitate;
    }

    public void setPuntosVisitate(int puntosVisitate) {
        this.puntosVisitate = puntosVisitate;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Partido{" + "codigo=" + codigo + ", equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", fecha=" + fecha + ", locacion=" + locacion + ", arbitro=" + arbitro + ", puntosLocal=" + puntosLocal + ", puntosVisitate=" + puntosVisitate + ", estado=" + estado + '}';
    }
    
    

    
    
    
    
}
