import javax.swing.JFrame;

public class DibujarArcos 
{
   
   public static void main(String[] args)
   {
   
      JFrame frame = new JFrame("Dibujando Arcos");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      ArcosJPanel arcsJPanel = new ArcosJPanel();
      frame.add(arcsJPanel); 
      frame.setSize(300, 210);
      frame.setVisible(true);
   } 
}