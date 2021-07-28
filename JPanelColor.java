/**
 *
 * @author Suazo
 */
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class JPanelColor extends JPanel{  
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.white);
        
        g.setColor(new Color(255,0,0));
        g.fillRect(15,25,100,20);
        g.drawString("RGB actual: "+ g.getColor(),130,40);
        
        g.setColor(new Color(0.5f,0.75f,0.0f));
        g.fillRect(15,75,100,20);
        g.drawString("RGB actual: "+ g.getColor(),130,65);
        
        g.setColor(Color.blue);
        g.fillRect(15,75,100,20);
        g.drawString("RGB actual: "+ g.getColor(),130,90);
        
        Color color = Color.magenta;
        g.setColor(color);
        g.fillRect(15,75,100,20);
        g.drawString("Valores RGB: "+ color.getRed()+ ", "+color.getGreen()+", "+color.getBlue(),130,115);
    }
    
}
