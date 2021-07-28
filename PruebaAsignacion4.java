import java.awt.Color;
import javax.swing.JFrame;


public class PruebaAsignacion4 {
    public static void main(String[] args) {
        JFrame prueba = new JFrame("Asignacion 4");
        prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Asignacion4 a = new Asignacion4();
        
        prueba.add(a);
        prueba.setBounds(200, 200, 1000, 800);
        prueba.setVisible(true);
    }
   
}
