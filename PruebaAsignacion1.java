
import java.awt.Color;
import javax.swing.JFrame;


public class PruebaAsignacion1 {
    public static void main(String[] args) {
        JFrame p = new JFrame("Asignacion 1");
         p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Asignacion1 ejercicio = new Asignacion1();
       ejercicio.setBackground(Color.white);
       p.add(ejercicio);
       p.setSize(690, 600);
       p.setVisible(true);
        
    }
}
