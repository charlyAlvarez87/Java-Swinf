package uca.com.py.javaswing;
import java.sql.*;

public class Conexion {
    public void consulta(){
        String url = "jdbc:postgresql://localhost:5432/Persona";
        String usuario = "postgres";
        String contrasenha = "admin";
        
        try{
            Class.forName("org.postgresql.Drivers");
            Connection conexion = DriverManager.getConnection(url, usuario,contrasenha);
            java.sql.Statement st = conexion.createStatement();
            String sql = "SELECT cedula FROM Persona";
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                String id = result.getString("IDPersona");
                String nombre = result.getString("Nombre");
                String cedula = result.getString("Cedula");
                String sexo = result.getString("Sexo");
                
                System.out.println("ID: "+id+"\nNombre: "+nombre+"\nCedula: "+cedula+"\nSexo: "+sexo);
            }
            result.close();
            st.close();
            conexion.close();
        }catch(Exception e){
            System.out.println("Error en la conexion"+e.getMessage());
        }
    }
}
