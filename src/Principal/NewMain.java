
package Principal;

import Controller.Controller;
import Modelo.Arbitro;
import Modelo.Jugador;
import Modelo.Persona;
import View.Principal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class NewMain {

    public static void PreCargaJugadores(List<Persona> personas,Map<String,Integer>equipos) throws IOException{
        File archivo = new File("Jugadores.txt");
        String nombre,apellido,nacionalidad,club,posicion;
        long DNI;
        int dia,mes,anio,goles,tarjetasAmarillas,tarjetasRojas;  
        if(archivo.exists()){

            try{
                BufferedReader buffer = new BufferedReader(new FileReader (archivo));
                
                while((nombre =buffer.readLine()) != null ){
                    apellido= buffer.readLine();
                    DNI= Long.parseLong(buffer.readLine());
                    dia= Integer.parseInt(buffer.readLine());
                    mes = Integer.parseInt(buffer.readLine());
                    anio = Integer.parseInt(buffer.readLine());
                    nacionalidad = buffer.readLine();
                    club = buffer.readLine();
                    posicion= buffer.readLine();
                    goles= Integer.parseInt(buffer.readLine());
                    tarjetasAmarillas= Integer.parseInt(buffer.readLine());
                    tarjetasRojas = Integer.parseInt(buffer.readLine());
                    
                    personas.add(new Jugador(club, posicion, tarjetasAmarillas, tarjetasRojas, goles, nombre, apellido, nacionalidad, DNI, dia, mes, anio));
                    equipos.put(club,equipos.getOrDefault(club,0)+1);
                }
                
                buffer.close();
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error\nno se puede leer el archivo Jugadores.txt");
                
            }
       
        }else{
            throw new IOException("No se puede abrir el archivo\n");
        }
        
    }
    public static void PreCargaArbitros(List<Persona>personas)throws IOException{
        String nombre,apellido,nacionalidad;
        long DNI;
        int dia,mes,anio,tarjetas;
        boolean internacional;
        try{
        BufferedReader buffer = new BufferedReader(new FileReader("Arbitros.txt"));
         while((nombre = buffer.readLine()) != null){
             
             apellido = buffer.readLine();
             DNI = Long.parseLong(buffer.readLine());
             dia= Integer.parseInt(buffer.readLine());
             mes = Integer.parseInt(buffer.readLine());
             anio = Integer.parseInt(buffer.readLine());
             nacionalidad = buffer.readLine();
             tarjetas= Integer.parseInt(buffer.readLine());
             internacional = Boolean.parseBoolean(buffer.readLine());
             personas.add(new Arbitro(tarjetas,internacional,nombre,apellido,nacionalidad,DNI,dia,mes,anio));
             
         }
        
        buffer.close();
        
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error\nNo se puede abrir el archivo Arbitros.txt\n");
        }
  }
    public static void main(String[] args) throws IOException {
        
        List<Persona> personas= new ArrayList<>();
        Map<String,Integer> equipos = new HashMap<>();
        
        Controller controller = new Controller(personas,equipos);
        
        Principal ventanaPrincipal = new Principal(controller);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);
        PreCargaArbitros(personas);
        PreCargaJugadores(personas,equipos);
 }
}
