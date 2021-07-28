/**
 *
 * @author Suazo
 */
import java.awt.*;
import javax.swing.*;

public class DibujarEspiral extends JFrame {
    
    //Definir eje x y el eje y
    private int[] x_Line = {150,235,265,228,150,79,55,86,150,207,225,199,150,108,95,115,150,178,185,171,150,136,135,143,150};
    private int[] y_Line = {275,235,150,72,45,79,150,214,235,207,150,101,85,108,150,185,195,178,150,129,125,136,150,157,155};
    
    public DibujarEspiral()
    {
        super("Dibujando Espiral");
        setSize(280,280);
        setVisible(true);
    }
    public void paint( Graphics graphics)
    {
        super.paint(graphics);
        graphics.drawPolyline(x_Line,y_Line,20);
    }
    
}
