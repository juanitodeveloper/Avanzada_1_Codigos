/**
 *
 * @author Suazo
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Shapes extends JFrame{
    private JComboBox shapesList;
    private JButton selectColor;
    private JPanel panel;
    
    //Variables
    private final int circulo =0;
    private final int cuadrado =1;
    private final int ovalo =2;
    private final int rectangulo =3;
    private final int tamano =400;
    
    private String[] shapesNames = {"Circulos random","Cuadrados random","Ovalos random","Rectangulos random"};
    
    private Color color;
    private int select;
    
    public Shapes(){
        shapesList = new JComboBox(shapesNames);
        shapesList.addItemListener(
            new ItemListener(){
            public void itemStateChanged (ItemEvent e){
            set(shapesList.getSelectedIndex());
            repaint();
            }            
        });

        selectColor=new JButton ("Selecciona un color" );
        selectColor.addActionListener(
                new ActionListener(){
                public void actionPerformed(ActionEvent e){
                color=JColorChooser.showDialog(null, "Selecciona un color", Color.red);
                repaint();
                }
        });
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));
        panel.add(shapesList);
        panel.add(selectColor);
        Container container = getContentPane();
        container.add(panel, BorderLayout.SOUTH);
        container.setBackground(Color.white);
        setSize (tamano+20,tamano+70);
        setVisible(true);
        
    }
    
    public void paint(Graphics g){
        int primero,segundo;
        int h,w,diametro;
        super.paint(g);
        
        for(int count=1;count<=20;count++){
            primero=(int)(Math.random()*tamano)+10;
            segundo=(int)(Math.random()*tamano)+25;
            w=(int)(Math.random()*(tamano-primero));
            h=(int)(Math.random()*(tamano-segundo));
            diametro = w;
            
            if (w>h)
            diametro = h;
            g.setColor(color);
            
            switch (select){
                case circulo: g.drawOval(primero,segundo,diametro,diametro);
                break;
                case cuadrado: g.drawRect(primero,segundo,diametro,diametro);
                break;
                case ovalo: g.drawOval(primero,segundo,w,h);
                break;
                case rectangulo: g.drawRect(primero,segundo,w,h);
                break;                
            }
            
        }
                
        }
    public void set(int s){
    select = s;
    }
    
}
