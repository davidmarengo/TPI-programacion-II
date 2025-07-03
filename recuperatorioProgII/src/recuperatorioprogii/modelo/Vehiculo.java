
package recuperatorioprogii.modelo;


public class Vehiculo {
    private static int contadorVehiculos = 1;
    private int codigo;
    private String nombre;
    private String modelo;
    private Marca marca;
    private int añoDeFabricacion;

    public Vehiculo( String nombre, String modelo, Marca marca, int añoDeFabricacion) {
        this.codigo = contadorVehiculos;
        contadorVehiculos ++;
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.añoDeFabricacion = añoDeFabricacion;
    }

    public static int getContadorVehiculos() {
        return contadorVehiculos;
    }

    public static void setContadorVehiculos(int contadorVehiculos) {
        Vehiculo.contadorVehiculos = contadorVehiculos;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getAñoDeFabricacion() {
        return añoDeFabricacion;
    }

    public void setAñoDeFabricacion(int añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }
    
    public void agregarMarca(Marca marca){
    this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + ", nombre=" + nombre + ", modelo=" + modelo + ", marca=" + marca + ", a\u00f1oDeFabricacion=" + añoDeFabricacion + '}';
    }
    
    

   
}
