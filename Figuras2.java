import java.awt.Color;
import javax.swing.JFrame;

public class Figuras2
{
   
   public static void main(String[] args)
   {
   
      JFrame frame = new JFrame("Dibujando Figuras 2D");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Figuras2JPanel shapes2JPanel = new Figuras2JPanel(); 
      frame.add(shapes2JPanel); 
      frame.setBackground(Color.WHITE);
      frame.setSize(400, 400);
      frame.setVisible(true);
   } 
} 