
package recuperatorioprogii.modelo;


public class Marca {
    private static int contador = 1;
    private int codigo;
    private String nommbre;

    public Marca() {
    }

    public Marca( String nommbre) {
        this.codigo = contador;
        contador ++;
        this.nommbre = nommbre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    @Override
    public String toString() {
        return "Marca{" + 
                "codigo=" + codigo + 
                ", nommbre=" + nommbre + '}';
    }
    
    
    
}
