import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;


public class Asignacion2 extends JPanel{
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    
        setBackground(new Color(158,220,235));
        g.setColor(new Color(74,184,72));
        g.fillArc(-300, 400, 1400, 1000, 0, 180);
        g.setColor(Color.black);
        g.fillOval(30, 180, 330, 220);
        g.fillRect(140, 250, 100, 450);
        g.fillRect(500, 500, 200, 200);
        int t[]={480,720,600};
        int t2[]={500,500,300};
        int t3[]={490,710,600};
        int t4[]={495,495,310};
        g.fillPolygon(t, t2, 3);
        g.setColor(Color.red);
        g.fillPolygon(t3, t4, 3);
        g.setColor(Color.blue);
        g.fillRect(505, 500, 190, 195);
        g.setColor(new Color(0, 102, 0));
        g.fillOval(33, 183, 324, 214);
        g.setColor(Color.black);
        g.fillRect(140, 320, 100, 400);
        g.fillRect(515, 510, 70, 90);
        g.fillRect(610, 510, 70, 190);
        g.setColor(new Color(102, 41, 0));
        g.fillRect(144, 325, 92, 390);
        g.fillRect(518, 513, 65, 84);
        g.fillRect(613, 513, 66, 182);
        g.setColor(Color.yellow);
        g.fillOval(200, 200, 30, 30);
        g.fillOval(160, 270, 30, 30);
        g.fillOval(70, 285, 30, 30);
        g.fillOval(280, 230, 30, 30);
        g.fillOval(280, 300, 30, 30);
         g.fillOval(245, 345, 30, 30);
         g.fillOval(100, 335, 30, 30);
         g.fillOval(110, 210, 30, 30);
        
    }
    
}
