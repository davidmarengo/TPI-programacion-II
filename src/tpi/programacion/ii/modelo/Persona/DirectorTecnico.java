
package tpi.programacion.ii.modelo.Persona;



public class DirectorTecnico extends Persona{
    
    private int contadorDT = 1;
    private int codigo;
    private int matricula;
    private String estado;

    public DirectorTecnico() {
    }

    public DirectorTecnico(String nombre,String apellido,String direccion,int DNI,String fechaNacimiento, int matricula) {
        super(nombre, apellido, direccion, DNI, fechaNacimiento);
        this.codigo = contadorDT;
        contadorDT ++;
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
        return "DirectorTecnico{" + "codigo=" + codigo + ", matricula=" + matricula + ", estado=" + estado + '}';
    }
    
    

}
