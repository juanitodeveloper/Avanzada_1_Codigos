
/**
 *
 * @author Suazo
 */
import javax.swing.JFrame;

public class PruebaGrid2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("DijubaLineas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Grid2 grid2 = new Grid2();
        frame.add(grid2);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    
}