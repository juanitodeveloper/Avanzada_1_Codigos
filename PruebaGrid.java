/**
 *
 * @author Suazo
 */

import javax.swing.JFrame;

public class PruebaGrid {

    public static void main(String[] args) {
        JFrame frame = new JFrame("DijubaLineas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Grid grid1 = new Grid();
        frame.add(grid1);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
}
