/**
 *
 * @author Suazo
 */
import javax.swing.*;
import java.awt.Rectangle;
import java.awt.Graphics;

public class Grid2 extends JPanel {
    public void paint (Graphics g){
        super.paint(g);
        for (int x=30;x<=300;x+=30)
            for (int y=30;y<=300;y+=30)
            g.drawRect(x,y,30,30);
    }
    
}
