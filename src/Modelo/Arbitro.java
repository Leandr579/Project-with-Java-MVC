package Modelo;

public class Arbitro extends Persona{
   
    int tarjetasSacadas;//(M)
    boolean internacional;//(M)

    
    public Arbitro(){
        super();
    }
    public Arbitro(int tarjetasSacadas, boolean internacional, String nombre, String apellido, String nacionalidad, long dni, Integer dia, Integer mes, Integer año) {
        super(nombre, apellido, nacionalidad, dni, dia, mes, año);
        this.tarjetasSacadas = tarjetasSacadas;
        this.internacional = internacional;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    @Override
    public void setDni(long dni) {
        this.dni = dni;
    }
    @Override
    public void setDia(Integer dia) {
        this.dia = dia;
    }
    @Override
    public void setMes(Integer mes) {
        this.mes = mes;
    }
    @Override
    public void setAño(Integer año) {
        this.año = año;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public String getApellido() {
        return apellido;
    }
    @Override
    public String getNacionalidad() {
        return nacionalidad;
    }
    @Override
    public long getDni() {
        return dni;
    }
    @Override
    public Integer getDia() {
        return dia;
    }
    @Override
    public Integer getMes() {
        return mes;
    }
    @Override
    public Integer getAño() {
        return año;
    }
    public int getTarjetasSacadas() {
        return tarjetasSacadas;
    }
    public void setTarjetasSacadas(int tarjetasSacadas) {
        this.tarjetasSacadas = tarjetasSacadas;
    }
    public boolean getInternacional() {
        return internacional;
    }
    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }
    @Override
    public String toString() {
        return "Arbitro{" + "tarjetasSacadas=" + tarjetasSacadas + ", internacional=" + internacional + '}';
    }
}
