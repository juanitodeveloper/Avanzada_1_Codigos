
package com.mycompany.ejercicio13x7;

/**
 *
 * @author Suazo
 */
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Circulos2 extends JPanel {
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (int topLeft = 0; topLeft<80;topLeft+=10){
            int radio =180 -(topLeft*2);
            g2d.drawOval(topLeft+10, topLeft+25, radio, radio);
        }
    }
    
}
