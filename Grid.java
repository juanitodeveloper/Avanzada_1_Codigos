

/**
 *
 * @author Suazo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Grid extends JPanel{
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        int y=30, x1=30;
        for(int r=0;r<=7;r++,y+=10)
            g.drawLine(30,y,100,y);
        for(int c=0;c<=7;c++,x1+=10)
            g.drawLine(x1,30,x1,100);
    }
}
