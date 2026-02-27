
package Modelo;

public abstract class Persona {
    protected String nombre, apellido,nacionalidad;
    protected long dni;
    protected Integer dia,mes,año;

    public String getNombre() {
        return nombre;
    }
    public abstract void setNombre(String nombre);
    public abstract String getApellido() ;
    public abstract void setApellido(String apellido);
    public abstract String getNacionalidad();
    public abstract void setNacionalidad(String nacionalidad) ;
    public abstract long getDni();
    public abstract void setDni(long dni); 
    public abstract Integer getDia(); 
    public abstract void setDia(Integer dia); 
    public abstract Integer getMes();
    public abstract void setMes(Integer mes);
    public abstract Integer getAño();
    public abstract void setAño(Integer año);
    public Persona(String nombre, String apellido, String nacionalidad, long dni, Integer dia, Integer mes, Integer año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.dni = dni;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    public Persona() {
    }
    @Override
    public abstract String toString();
    
}
