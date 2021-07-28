/**
 *
 * @author Suazo
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class MostrarColores2JFrame extends JFrame 
{
   private final JButton changeColorJButton;
   private Color color = Color.LIGHT_GRAY;
   private final JPanel colorJPanel;

  
   public MostrarColores2JFrame()
   {
      super("Uso de JColorChooser");

      colorJPanel = new JPanel();
      colorJPanel.setBackground(color);

      changeColorJButton = new JButton("Cambiar Color");
      changeColorJButton.addActionListener(
         new ActionListener()
         {
            
            @Override
            public void actionPerformed(ActionEvent event)
            {
               color = JColorChooser.showDialog(
                  MostrarColores2JFrame.this, "Seleccione un color", color);

               if (color == null)
                  color = Color.LIGHT_GRAY;

               colorJPanel.setBackground(color);
            } 
         } 
      );
 
      add(colorJPanel, BorderLayout.CENTER); 
      add(changeColorJButton, BorderLayout.SOUTH);

      setSize(400, 130);
      setVisible(true);
   }
} 