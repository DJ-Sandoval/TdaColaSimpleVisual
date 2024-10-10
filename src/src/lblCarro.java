/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Jose
 */
public class lblCarro extends JLabel {
    
    public lblCarro(String imagePath, int width, int height) {
        // Establecer la imagen
        ImageIcon icon = new ImageIcon(imagePath);
        // Escalar la imagen al tama?o especificado
        Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(image));
        
        // Establecer el tama?o de la etiqueta
        this.setBounds(500, 50, width, height); // Ajusta las posiciones seg?n sea necesario
        
        
    }
}
    

