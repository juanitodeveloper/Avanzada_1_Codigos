/**
 *
 * @author Suazo
 */

import javax.swing.JFrame;

public class TrianguloPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Triangulos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Triangulos1 triangulo = new Triangulos1();
        frame.add(triangulo);
        frame.setSize(450,450);
        frame.setVisible(true);
    }
    
}
