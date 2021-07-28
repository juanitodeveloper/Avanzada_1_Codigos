/**
 *
 * @author Suazo
 */
import javax.swing.JFrame;

public class LineasRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("LineasRandom");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lineas lineas = new Lineas();
        frame.add(lineas);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
}
