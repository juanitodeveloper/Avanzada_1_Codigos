/**
 *
 * @author Suazo
 */
import javax.swing.JFrame;

public class PruebaCubo extends JFrame{
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cubo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Cubito cub1 = new Cubito();
        frame.add(cub1);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
}
