
package tpi.programacion.ii.modelo;



public class Fecha {
    private int contadorFecha = 1;
    private int numeroFecha;
    private int fecha;

    public Fecha() {
    }

    public Fecha(int numeroFecha, int fecha) {
        this.numeroFecha = contadorFecha;
        contadorFecha ++;
        this.fecha = fecha;
    }

    public int getNumeroFecha() {
        return numeroFecha;
    }

    public void setNumeroFecha(int numeroFecha) {
        this.numeroFecha = numeroFecha;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Fecha{" + "numeroFecha=" + numeroFecha + ", fecha=" + fecha + '}';
    }
    
    
    

}
