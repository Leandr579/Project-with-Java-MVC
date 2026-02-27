
package Controller;

import Modelo.Arbitro;
import Modelo.EliminarException;
import Modelo.Jugador;
import Modelo.Persona;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class Controller {
 
    private List<Persona>lista;
    private Map<String,Integer>equipos;
    private Jugador jugador;
    private Arbitro arbitro;
    public Controller(List<Persona>lista,Map<String,Integer>equipos){
    this.lista= lista;
    this.equipos=equipos;
        
    }
    
    public void inicializarJugador(Jugador jugador){
        this.jugador=jugador;
    }
    public void inicializarArbitro(Arbitro arbitro){
        this.arbitro = arbitro;
    }
    public void Ingreso(int condicion,Object persona){
        if(condicion == 1){//Ingresa jugador
                String nombre= ((Jugador)persona).getClub();
                if( equipos.get(nombre) < 7 ){
                    lista.add((Jugador)persona);
                    equipos.put(nombre,equipos.getOrDefault(nombre, 0) +1);
                    JOptionPane.showMessageDialog(null,"Jugador cargado correctamente\n");
                }
                else{
                JOptionPane.showMessageDialog(null, "No se puede cargar\nLimite de jugadores alcanzado\n");
                    }
                }
             
         if(condicion == 0){//Ingresa arbitro
            lista.add((Arbitro)persona);
            JOptionPane.showMessageDialog(null,"Arbitro cargado correctamente\n");
        } 
            }
    public Object buscarDNI(int condicion,long dni){
        Object resultado = null;
        if(condicion == 1){
            for(Object personas : lista){
                if(personas instanceof Jugador){
                    if(((Jugador) personas).getDni() == dni ){
                        resultado = (Jugador)personas;
                    }
                }
            }
        }
         if(condicion == 0){
            for(Object personas : lista){
                if(personas instanceof Arbitro){
                    if(((Arbitro) personas).getDni()== dni){
                        resultado= (Arbitro)personas;
                    }
                }
            }
        }
             return resultado;
    }
    public void Eliminar(int condicion,long DNI)throws EliminarException{
    if(condicion == 1){
            try{
            Object jugador1 = buscarDNI(condicion,DNI);
            String nombre = ((Jugador)jugador1).getClub();
                    if(equipos.get(nombre) > 5){
                        int cantidad = equipos.get(nombre);
                        lista.remove(jugador1);
                        equipos.put(nombre, cantidad-1);
                        JOptionPane.showMessageDialog(null,"Jugador borrado!!");
                    }else{
                        throw new EliminarException();
                    }
                    
                }
              catch(EliminarException e){
                     JOptionPane.showMessageDialog(null, "No se puede eliminar jugador\nMinimo alcanzado");   
                 }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "No se puede eliminar jugador\n");   
            }
}   
     
       if(condicion == 0){
            
            try{
                
                Object arbitro1 = buscarDNI(condicion, DNI);
                if(arbitro1 != null){
                lista.remove(arbitro1);
                JOptionPane.showMessageDialog(null, "Arbitro borrado!!");
                
                }
                
                else{
                    throw new NullPointerException();
                }
            }catch(NullPointerException e){
                
                JOptionPane.showMessageDialog(null,"No se puede eliminar arbitro\n");
            }
            
            
        }
     
}
    public int Modificar(long DNI){
            Jugador viejo =(Jugador) buscarDNI(1, DNI);
            int resultado=viejo.getTarjetaRoja();  
            try {
                lista.remove(viejo);
            Jugador nuevo = viejo;
            int cantidad= nuevo.getTarjetaRoja();
            nuevo.setTarjetaRoja(cantidad+1);
            resultado = nuevo.getTarjetaRoja();
            lista.add(nuevo);
            JOptionPane.showMessageDialog(null,"Tarjeta Sumada");
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "No se puede modificar el jugador\n");
            }
      return resultado;      
        }
    public void Modificar(int condicion,long DNI,String posicion,int goles,int tarjetas){
        if(condicion == 1){
         
            try {
            Jugador viejo =(Jugador) buscarDNI(condicion, DNI);
            lista.remove(viejo);
            Jugador nuevo = viejo;
            nuevo.setGoles(goles);
            nuevo.setPosicion(posicion);
            nuevo.setTarjetaAmarilla(tarjetas);
            lista.add(nuevo);
            JOptionPane.showMessageDialog(null,"Jugador Modificado");
            
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "No se puede modificar el jugador\n");
            }
        }
    }
    public void modificar(int condicion,int tarjetas,boolean internacional,long DNI){
     if(condicion == 0){      
            
            try{
                Arbitro viejo = (Arbitro)buscarDNI(condicion, DNI);
                lista.remove(viejo);
                Arbitro nuevo = viejo;
                nuevo.setTarjetasSacadas(tarjetas);
                nuevo.setInternacional(internacional);
                
                lista.add(nuevo);
                JOptionPane.showMessageDialog(null,"Arbitro Modificado");
                
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"No se puede modificar el arbitro");
            }
        }
    }
    public int cantidadPorEquipo(String equipo){
        int resultado= equipos.get(equipo);     
        return resultado;
    }
    public int cantidadPorPosicion(String posicion){
        int contador=0;
        for(Object persona : lista){
            if(persona instanceof Jugador){
                if(((Jugador) persona).getPosicion().equals(posicion)){
                    contador ++;
                }
            }
        }
        return contador;
    }
    public Jugador BuscarPeorJugador(){
        Jugador jugador = new Jugador();
        int cantidad=0;
        for(Object persona : lista){
            if(persona instanceof Jugador){
                if(((Jugador) persona).getTarjetaRoja() > cantidad){
                    cantidad = ((Jugador) persona).getTarjetaRoja();
                    jugador = (Jugador)persona;
                }
            }
        }
        return jugador;
    }
    public List<Jugador> listaDeJugadores(int cantidadgoles){
        List<Jugador> jugadores = new ArrayList<>();
        
        for(Object per : lista){
            if(per instanceof Jugador){
                if(((Jugador) per).getGoles() >= cantidadgoles){
                    
                    jugadores.add((Jugador)per);
                }
            }
        }
        return jugadores;
    }
    public List<Arbitro> listaDeArbitros(boolean internacional){
        List<Arbitro> nueva = new ArrayList<>();
        
        for(Object per: lista){
            if(per instanceof Arbitro){
                if(((Arbitro) per).getInternacional() == internacional){
                    nueva.add((Arbitro)per);
                }
            }
        }
        
        return nueva;
    }
    public List<Arbitro> listaDeArbitros(){
  List<Arbitro> nueva = new ArrayList<>();
        for(Object per: lista){
            if(per instanceof Arbitro){
                nueva.add((Arbitro)per);
            }
            
        }
    return nueva;
}
    public boolean buscarDni(long dni){
    boolean resultado= false;

for(Object persona:lista){
    
    if(persona instanceof Jugador){
        if(((Jugador)persona).getDni() == dni){
            resultado = true;
        }
    }
    if(persona instanceof Arbitro){
        if(((Arbitro)persona).getDni()== dni){
            resultado = true;
            
        }
        
    }
    
}
return resultado;
}
    public void Actualizar(){
   
    try{
       BufferedWriter buffer = new BufferedWriter(new FileWriter("Jugadores.txt"));
       BufferedWriter arbitros = new BufferedWriter(new FileWriter("Arbitros.txt"));
       for(Object persona : lista){
          if(persona instanceof Jugador){
              buffer.write(((Jugador) persona).getNombre());
              buffer.newLine();
              buffer.write(((Jugador)persona).getApellido());
              buffer.newLine();
              buffer.write(Long.toString(((Jugador)persona).getDni()));
              buffer.newLine();
              buffer.write(Integer.toString(((Jugador)persona).getDia()));
              buffer.newLine();
              buffer.write(Integer.toString(((Jugador)persona).getMes()));
              buffer.newLine();
              buffer.write(Integer.toString(((Jugador)persona).getAño()));
              buffer.newLine();
              buffer.write(((Jugador)persona).getNacionalidad());
              buffer.newLine();
              buffer.write(((Jugador) persona).getClub());
              buffer.newLine();
              buffer.write(((Jugador) persona).getPosicion());
              buffer.newLine();
              buffer.write(Integer.toString(((Jugador)persona).getGoles()));
              buffer.newLine();
              buffer.write(Integer.toString(((Jugador)persona).getTarjetaAmarilla()));
              buffer.newLine();
              buffer.write(Integer.toString(((Jugador)persona).getTarjetaRoja()));
              buffer.newLine();
 
          } 
          
          if(persona instanceof Arbitro){
              arbitros.write(((Arbitro)persona).getNombre());
              arbitros.newLine();
              arbitros.write(((Arbitro)persona).getApellido());
              arbitros.newLine();
              arbitros.write(Long.toString(((Arbitro)persona).getDni()));
              arbitros.newLine();
              arbitros.write(Integer.toString(((Arbitro)persona).getDia()));
              arbitros.newLine();
              arbitros.write(Integer.toString(((Arbitro)persona).getMes()));
              arbitros.newLine();
              arbitros.write(Integer.toString(((Arbitro)persona).getAño()));
              arbitros.newLine();
              arbitros.write(((Arbitro)persona).getNacionalidad());
              arbitros.newLine();
              arbitros.write(Integer.toString(((Arbitro)persona).getTarjetasSacadas()));
              arbitros.newLine();
              arbitros.write(Boolean.toString(((Arbitro)persona).getInternacional()));
              arbitros.newLine();          
          }
           
           
       }
    
    buffer.close();
    arbitros.close();
    } 
    catch(IOException e){
        JOptionPane.showMessageDialog(null,"No se puede escribir en el archivo");
      
    }
 
}
    
    public void setNombre(int condicion, String nombre){
        if (condicion==1){
        jugador.setNombre(nombre);
        }
        if (condicion == 0){
            arbitro.setNombre(nombre);
        }
         
    }
    public void setApellido(int condicion ,String apellido){
        if (condicion == 1){
        jugador.setApellido(apellido);
        }
        if(condicion == 0){
            arbitro.setApellido(apellido);
        }
    }
    public void setDia(int condicion,int dia){
        if (condicion==1){
        jugador.setDia(dia);
        }
        if (condicion == 0){
            arbitro.setDia(dia);
        }
    }
    public void setMes(int condicion ,int mes){
        if(condicion == 1){
        jugador.setMes(mes);
        }
        if (condicion ==0){
            arbitro.setMes(mes);
        }
        
        }
        
    public void setAnio(int condicion,int anio){
       if(condicion == 1){
        jugador.setAño(anio);
       }
       if (condicion == 0){
           arbitro.setAño(anio);
       }
    }
    public void setNacionalidad(int condicion, String nacionalidad){
        if(condicion== 1){
        jugador.setNacionalidad(nacionalidad);
        }
        if (condicion == 0){
            arbitro.setNacionalidad(nacionalidad);
        }
    }
    
    public void setPosicion(String posicion){
        jugador.setPosicion(posicion);
    }
    
    public void setGoles(int goles){
        jugador.setGoles(goles);
    }
    public void setTarjetasAmarillas(int tarjetas){
        jugador.setTarjetaAmarilla(tarjetas);
    }
    public void setTarjetasRojas(int tarjetas){
        jugador.setTarjetaRoja(tarjetas);
    }
    public void setClub(String club){
        jugador.setClub(club);
    }
    public void setTarjetasSacadas(int tarjetas){
        arbitro.setTarjetasSacadas(tarjetas);
    }
    public void setInternacional(boolean internacional){
        arbitro.setInternacional(internacional);
    }
    
    public String getNombreJ(){
        return jugador.getNombre();
    }
    public String getNombreA(){
        return arbitro.getNombre();
    }
    
    public String getApellidoJ(){
        return jugador.getApellido();
    }
    public String getApellidoA(){
        return arbitro.getApellido();
    }
    public String getNacionalidadJ(){
        return jugador.getNacionalidad();
    }
    public String getNacionalidadA(){
        return arbitro.getNacionalidad();
    }
    
    public int getDiaJ(){
        return jugador.getDia();
    }
    public int getDiaA(){
        return arbitro.getDia();
    }
    public int getMesJ(){
        return jugador.getDia();
    }
    public int getMesA(){
        return arbitro.getDia();
    }
    public int getAnioJ(){
        return jugador.getDia();
    }
    public int getAnioA(){
        return arbitro.getDia();
    }
    
    public String getClub(){
        return jugador.getClub();
    }
    
    public int getTarjetaRoja(){
        return jugador.getTarjetaRoja();
    }
    public int getTarjetaAmarilla(){
        return jugador.getTarjetaAmarilla();
    }
    public String getPosicion(){
        return jugador.getPosicion();
    }
    public int getGoles(){
        return jugador.getGoles();
    }
    public int getTarjetasSacadas(){
        return arbitro.getTarjetasSacadas();
    }
    public boolean getInternacional(){
        return arbitro.getInternacional();
    }
    public void setDniJ(long dni){
        jugador.setDni(dni);
    }
    public void setDniA(long dni){
        arbitro.setDni(dni);
    }
    public long getDniJ(){
        return jugador.getDni();
    }
    public long getDniA(){
        return arbitro.getDni();
    }
    
    
    public Arbitro getArbitro(){
        return arbitro;
    }
    public Jugador getJugador(){
        return jugador;
    }
    
}
