import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccion {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/prueba_java"; // Cambiar si tu base tiene otro nombre
        String usuario = "root";
        String contraseña = "admin"; // Cambiar por la tuya

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("✅ Conexión exitosa a MySQL");
            conexion.close();
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar con MySQL:");
            e.printStackTrace();
        }
    }
}
