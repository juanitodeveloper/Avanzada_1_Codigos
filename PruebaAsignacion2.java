import javax.swing.JFrame;

public class PruebaAsignacion2 {
    public static void main(String[] args) {
        JFrame prueba = new JFrame("Segunda Asignacion");
        prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Asignacion2 asig2 = new Asignacion2();
        prueba.add(asig2);
        prueba.setVisible(true);
        prueba.setBounds(250, 200, 800, 800);
        
    }
    
}
