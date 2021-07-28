/**
 *
 * @author Suazo
 */
import javax.swing.JFrame;


public class PruebaTetra extends JFrame{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tetraedro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Tetraedro tr = new Tetraedro();
        frame.add(tr);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
}
