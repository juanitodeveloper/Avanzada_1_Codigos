// Fig. 12.10: TextFieldTest.java
// Testing TextFieldFrame.
import javax.swing.JFrame;

/**
 *
 * @author Suazo
 */
public class PruebaCampoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CampoTextoMarco textFieldFrame = new CampoTextoMarco(); 
      textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      textFieldFrame.setSize(350, 100); 
      textFieldFrame.setVisible(true); 
    }
    
}
