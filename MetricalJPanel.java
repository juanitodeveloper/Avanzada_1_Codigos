import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MetricalJPanel extends JPanel 
{
   // display font metrics
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g); 

      g.setFont(new Font("SansSerif", Font.BOLD, 12));
      FontMetrics metrics = g.getFontMetrics();
      g.drawString("Tipo de letra actual: " + g.getFont(), 10, 30);
      g.drawString("Ascendente: " + metrics.getAscent(), 10, 45);
      g.drawString("Descendente: " + metrics.getDescent(), 10, 60);
      g.drawString("Altura: " + metrics.getHeight(), 10, 75);
      g.drawString("Interlineado: " + metrics.getLeading(), 10, 90);

      Font font = new Font("Serif", Font.ITALIC, 14);
      metrics = g.getFontMetrics(font);
      g.setFont(font);
      g.drawString("Tipo de letra actual: " + font, 10, 120);
      g.drawString("Ascendente: " + metrics.getAscent(), 10, 135);
      g.drawString("Descendente: " + metrics.getDescent(), 10, 150);
      g.drawString("Altra: " + metrics.getHeight(), 10, 165);
      g.drawString("Interlineado: " + metrics.getLeading(), 10, 180);
   } 
}