import java.awt.Color;
import javax.swing.JFrame;

public class LineasRectOvalos
{
   public static void main(String[] args)
   {
      JFrame frame = 
         new JFrame("Dibujando lineas, rectangulos and ovalos");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      LineasRectsOvalosJPanel linesRectsOvalsJPanel = 
         new LineasRectsOvalosJPanel(); 
      linesRectsOvalsJPanel.setBackground(Color.WHITE); 
      frame.add(linesRectsOvalsJPanel); 
      frame.setSize(400, 210);
      frame.setVisible(true);
   } 
}