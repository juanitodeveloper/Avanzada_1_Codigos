import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Asignacion1 extends JPanel{
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(new Color(51, 255, 255));
        
        g.setColor(Color.black);
        g.drawArc(-30, 142, 103,50,45, 90);
        g.drawArc(233, 142, 110, 50,45, 90);
        g.drawArc(350, 120, 300, 100,0, 180);
        
        
        g.setColor(Color.green);
        g.fillOval(348, 121, 303, 121);
        g.fillOval(204, 142, 168, 142);
        g.fillOval(-40, 142, 130, 142);
        g.fillRect(0, 151, 650, 200);
        g.fillRect(0, 513, 650, 200);
        
        g.setColor(Color.black);
       
        
        g.drawLine(55, 150, 250, 150);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 357, 650, 150);
        
        
        
        g.setColor(new Color(150, 70, 80));
        g.fillRect(325, 60, 40, 90);
        g.fillRect(365, 60, 40, 90);
        g.setColor(Color.black);
        g.drawRect(325, 60, 40, 90);
         g.drawRect(340, 40, 50, 50);
        g.drawRect(365, 60, 40, 90);
        
        
        g.setColor(Color.red);
        g.fillRect(341, 41, 49, 49);
        
        g.setColor(Color.white);
        g.fillRect(40, 425, 80, 10);
        g.fillRect(220, 425, 80, 10);
        g.fillRect(370, 425, 80, 10);
        g.fillRect(550, 425, 80, 10);
        
        g.setColor(Color.black);
        g.fillOval(100, 410, 50, 50);
        g.fillOval(155, 410, 50, 50);
        g.fillOval(310, 410, 50, 50);
        g.fillOval(365, 410, 50, 50);
        g.fillOval(550, 410, 50, 50);
        g.fillRect(80, 200, 400, 210);
        g.fillRect(60, 90, 70, 60);
        g.fillRect(180, 90, 70, 60);
        int t[]={58,132,95};
        int t2[]={90,90,20};
        int t3[]={180,250,215};
        int t4[]={90,90,20};
        int t5[]={477,580,525};
        int t6[]={205,205,130};
        g.fillPolygon(t, t2, 3);
        g.fillPolygon(t3, t4, 3);
        g.fillPolygon(t5, t6, 3);
        
         int t7[]={590,650,620};
        int t8[]={305,305,250};
        g.fillPolygon(t7, t8, 3);
        g.fillRect(477, 205, 102, 205);
        g.fillRect(577, 305, 102, 105);
        g.setColor(Color.red);
        int t12[]={62,128,95};
        int t22[]={88,88,24};
        int t32[]={184,246,215};
        int t42[]={88,88,24};
        int t52[]={484,574,525};
        int t62[]={200,200,134};
        g.fillPolygon(t12, t22, 3);
        g.fillPolygon(t32, t42, 3);
        g.fillPolygon(t52, t62, 3);
        g.setColor(Color.MAGENTA);
         int t72[]={594,646,620};
        int t82[]={304,304,256};
        g.fillPolygon(t72, t82, 3);
        g.setColor(Color.blue);
        g.fillRect(477, 200, 97, 200);
        g.fillRect(578, 309, 97, 96);
        g.fillRect(63, 92, 64, 56);
        g.setColor(Color.yellow);
        g.fillRect(183, 92, 64, 56);
        g.setColor(Color.black);
        g.fillRect(480, 215, 90, 45);
        g.fillRect(485, 290, 80, 110);
        g.setColor(new Color(51, 255, 255));
        g.fillRect(484, 219, 83, 38);
        g.setColor(Color.green);
        g.fillRect(489, 294, 73, 103);
        g.setColor(Color.white);
        g.fillRect(90, 210, 380, 190);
        
       
    }

    
}
