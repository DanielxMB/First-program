/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author danielxmb
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
         /*
        
        Input con salida gráfica
        
        */
       
       String cancion;
       int Ncancion;
       double duracion;
       char promedio;
       
       cancion = JOptionPane.showInputDialog("Canción favorita: ");
       Ncancion = Integer.parseInt(JOptionPane.showInputDialog("Número de la canción favorita: "));
       duracion = Double.parseDouble(JOptionPane.showInputDialog("Duración de la canción favorita: "));
       promedio = JOptionPane.showInputDialog("Promedio de la canción: ").charAt(0);
       
       /*
       
       Output con salida gráfica
       
       */
       
       JOptionPane.showMessageDialog(null, "Nombre: "+cancion);
       JOptionPane.showMessageDialog(null, "Número de canción: "+Ncancion);
       JOptionPane.showMessageDialog(null, "Duración: "+duracion);
       JOptionPane.showMessageDialog(null, "Promedio: "+promedio);
       
       JOptionPane.showMessageDialog(null, "by The Weeknd");
       
       
    
        
    }
    
}
