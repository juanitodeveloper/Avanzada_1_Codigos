
package com.mycompany.ejercicio13x7;

/**
 *
 * @author Suazo
 */
import javax.swing.JFrame;
public class PruebaCirculos2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("CirculoConcentrico2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Circulos2 circulosJPanel = new Circulos2();
        frame.add(circulosJPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
}
