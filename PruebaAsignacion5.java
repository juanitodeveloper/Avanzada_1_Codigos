
import javax.swing.JFrame;

public class PruebaAsignacion5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Asignacion 5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Asignacion5 asignacion = new Asignacion5();
        frame.add(asignacion);
        frame.setVisible(true);
        frame.setBounds(250, 250, 1000, 600);
    }
}
