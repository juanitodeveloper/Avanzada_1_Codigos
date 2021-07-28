import javax.swing.JFrame;

public class PruebaAsignacion3 {
    public static void main(String[] args) {
        JFrame test = new JFrame("tercera Asignacion");
        
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Asignacion3 prueba = new Asignacion3();
        test.add(prueba);
        test.setVisible(true);
        test.setBounds(250, 200, 900, 700);
        
    }
    
}