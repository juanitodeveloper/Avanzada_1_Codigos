import javax.swing.JFrame;

public class Metrica 
{
   // execute application
   public static void main(String[] args)
   {
      // create frame for MetricsJPanel
      JFrame frame = new JFrame("Demonstracion de FontMetrics");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      MetricalJPanel metricsJPanel = new MetricalJPanel(); 
      frame.add(metricsJPanel); 
      frame.setSize(530, 250);
      frame.setVisible(true);
   } 
}