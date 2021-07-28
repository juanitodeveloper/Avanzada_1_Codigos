/**
 *
 * @author Suazo
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Tetraedro extends JPanel {
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        int basex[]={100,200,150,50,100};
        int basey[]={100,100,130,130,100};
        int x=110, y=40;
        
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath tetra = new GeneralPath();
        g2d.setColor(Color.red);
        tetra.moveTo(basex[0], basey[0]);
        
        for (int i=1;i<5;i++){
            tetra.lineTo(x, y);
            tetra.moveTo(basex[i-1], basey[i-1]);
            tetra.lineTo(basex[i], basey[i]);
            
        }
        
        tetra.closePath();
        g2d.draw(tetra);
    }
    
}
