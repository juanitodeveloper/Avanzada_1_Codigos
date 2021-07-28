/**
 *
 * @author Suazo
 */

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class CirculosJPanel extends JPanel{
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        for(int topIzq =0; topIzq <80;topIzq+=10){
            int radio = 180 - (topIzq*2);
            g.drawArc(topIzq+10,topIzq+25,radio,radio,0,360);
        }      
    }
}

