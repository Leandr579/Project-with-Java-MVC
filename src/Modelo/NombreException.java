
package Modelo;

import javax.swing.JOptionPane;

public class NombreException extends Exception {
    
    public NombreException(){
        JOptionPane.showMessageDialog(null,"Nombre/Apellido invalido","Error",JOptionPane.ERROR_MESSAGE);
    }
}
