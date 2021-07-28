/**
 *
 * @author Suazo
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;


public class Triangulos1 extends JPanel{
    
    public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        for (int i=0; i<10;i++){
            GeneralPath triangle = new GeneralPath();
            int x=(int)(Math.random()*375+25);
            int y=(int)(Math.random()*375+25);
            triangle.moveTo(x, y);
            
            x = (int)(Math.random()*375+25);
            y = (int)(Math.random()*375+25);
            triangle.lineTo(x, y);
            
            x = (int)(Math.random()*375+25);
            y = (int)(Math.random()*375+25);
            triangle.lineTo(x, y);
            triangle.closePath();
            
            //Color
            g.setColor(new Color((float)Math.random(),(float)Math.random(),(float)Math.random()));
            g2d.fill(triangle);
            
        }
    }
    
}
