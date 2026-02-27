package Modelo;

public class Jugador extends Persona {
    
  private  String club;
  private  String posicion;
  private  int tarjetaAmarilla;
  private  int tarjetaRoja;
  private  int goles;

    public Jugador() {
        super();
    }
    public Jugador(String club, String posicion, int tarjetaAmarilla, int tarjetaRoja, int goles, String nombre, String apellido, String nacionalidad, long dni, Integer dia, Integer mes, Integer año) {
        super(nombre, apellido, nacionalidad, dni, dia, mes, año);
        this.club = club;
        this.posicion = posicion;
        this.tarjetaAmarilla = tarjetaAmarilla;
        this.tarjetaRoja = tarjetaRoja;
        this.goles = goles;
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
    public void setClub(String club) {
        this.club = club;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public void setTarjetaAmarilla(int tarjetaAmarilla) {
        this.tarjetaAmarilla = tarjetaAmarilla;
    }
    public void setTarjetaRoja(int tarjetaRoja) {
        this.tarjetaRoja = tarjetaRoja;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }
    public String getClub() {
        return club;
    }
    public String getPosicion() {
        return posicion;
    }
    public int getTarjetaAmarilla() {
        return tarjetaAmarilla;
    }
    public int getTarjetaRoja() {
        return tarjetaRoja;
    }
    public int getGoles() {
        return goles;
    }
    @Override
    public String toString() {
        return "Jugador{" + "club=" + club + ", posicion=" + posicion + ", tarjetaAmarilla=" + tarjetaAmarilla + ", tarjetaRoja=" + tarjetaRoja + ", goles=" + goles + '}';
    } 
    
    
  
}
