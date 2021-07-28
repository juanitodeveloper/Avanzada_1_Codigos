import javax.swing.JFrame;

public class DibujarPoligonos 
{
   
   public static void main(String[] args)
   {
   
      JFrame frame = new JFrame("Dibujando Poligonos");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      PoligonosJPanel polygonsJPanel = new PoligonosJPanel(); 
      frame.add(polygonsJPanel); 
      frame.setSize(280, 270);
      frame.setVisible(true);
   } 
}