import javax.swing.JFrame;

public class Figuras
{
   
   public static void main(String[] args)
   {
   
      JFrame frame = new JFrame("Dibujando figuras 2D");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
      FigurasJPanel shapesJPanel = new FigurasJPanel();
      frame.add(shapesJPanel); 
      frame.setSize(425, 200);
      frame.setVisible(true);
   } 
}