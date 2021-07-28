
/**
 *
 * @author Suazo
 */
import javax.swing.JFrame;

public class PruebaCirculosJPanel extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame ("CirculoConcentrico");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CirculosJPanel circulosJPanel = new CirculosJPanel();
        frame.add(circulosJPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
}
