
package tpi.programacion.ii.modelo.Persona;



public class EntrenadorFisico extends Persona{
    
    private int contadorEntrenador = 1;
    private int codigo;
    private int matricula;
    private String estado;

    public EntrenadorFisico() {
    }

    public EntrenadorFisico(String nombre,String apellido,String direccion,int DNI,String fechaNacimiento, int matricula) {
        super(nombre, apellido, direccion, DNI, fechaNacimiento);
        this.codigo = contadorEntrenador;
        contadorEntrenador ++;
        this.matricula = matricula;
        this.estado = "activo";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EntrenadorFisico{" + "codigo=" + codigo + ", matricula=" + matricula + ", estado=" + estado + '}';
    }
    
    

}
