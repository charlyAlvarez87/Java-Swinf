package uca.com.py.javaswing;

public class Persona {
    private Integer IDPersona;
    private String Nombre;
    private String Cedula;
    private String Sexo;
    
    public Persona(){}
    public Integer getIDPersona() {
        return IDPersona;
    }

    public void setIDPersona(Integer IDPersona) {
        this.IDPersona = IDPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }   

    void getIDPersona(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
