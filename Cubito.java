

/**
 *
 * @author Suazo
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;


public class Cubito extends JPanel{
    
        public void paint (Graphics g){
        super.paint(g);
        int base1X[]={100,100,200,200,100};
        int base1Y[]={100,200,200,100,100};
        int base2X[]={75,75,175,175,75};
        int base2Y[]={75,175,175,75,75};
                
        Graphics2D g2d = (Graphics2D) g;

        GeneralPath cubo = new GeneralPath();
        g2d.setColor(Color.red);                         
        for (int i=1;i<=4;i++){
            cubo.moveTo(base1X[i-1], base1Y[i-1]);
            cubo.lineTo(base1X[i], base1Y[i]);
            cubo.moveTo(base2X[i-1], base2Y[i-1]);
            cubo.lineTo(base2X[i], base2Y[i]);
            cubo.moveTo(base1X[i], base1Y[i]);
            cubo.lineTo(base2X[i], base2Y[i]);
            
        }

    g2d.draw(cubo);
    }
    
}
