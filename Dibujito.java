package com.mycompany.examenii;

/**
 * Examen del segundo parcial, dibuja un escenario en la pantalla
 *
 * @author Suazo
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.BasicStroke;
import java.awt.GradientPaint;
import java.awt.TexturePaint;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;


public class Dibujito extends JPanel{
    
    @Override
    public void paintComponent (Graphics g)
    {
      super.paintComponent(g); 
      Graphics2D g2d = (Graphics2D) g; // cast g to Graphics2D
      //Fondo cielo
      GradientPaint degradado1 = new GradientPaint(0,0,Color.blue,0,100,Color.cyan,false);
      g2d.setPaint(degradado1);
      g2d.fillRect(0,0,800,200);
      
      //Fondo Pasto
      final Color colorVerdeOscuro = new Color(5,125,37);
      Graphics2D g2d_abajo = (Graphics2D) g;
      GradientPaint degradado2 = new GradientPaint(0,200,Color.green,0,500,colorVerdeOscuro,false);
      g2d_abajo.setPaint(degradado2);
      g2d_abajo.fillRect(0,200,800,400);
      
      //Casa
      g.setColor(new Color(254,153,52));
      g.fillRect(150, 150, 150, 200);
      g.fillRect(300, 150, 150, 200);
      g.fillRect(450, 150, 90, 100);
      g.fillRect(450, 250, 90, 100);
      
      g.setColor(new Color(0,0,0));
      g.drawRect(150, 150, 150, 200);
      g.drawRect(300, 150, 150, 200);
      g.drawRect(450, 150, 90, 100);
      g.drawRect(450, 250, 90, 100);
      
      //ventana
      g.setColor(Color.cyan);
      g.fillRect(170, 180, 110, 120);
      
      g.setColor(new Color(0,0,0));
      g.drawRect(170, 180, 110, 120);
      
      g.drawLine(170,210,280,210);
      g.drawLine(170,240,280,240);
      g.drawLine(170,270,280,270);
      
      g.drawLine(192,180,192,300);
      g.drawLine(214,180,214,300);
      g.drawLine(236,180,236,300);
      g.drawLine(258,180,258,300);
      g.drawLine(280,180,280,300);
      
      
      //Techoatras
      g.setColor(new Color(217,123,11));
      g.fillRect(225, 90, 255, 60);
      g.fillRoundRect(460, 83, 30, 7, 10, 10);
      
      g.fillRect(462, 65, 25, 30);
      g.fillRect(460, 55, 10, 10);
      g.fillRect(468, 55, 12, 10);
      g.fillRect(480, 55, 10, 10);
      
      
      g.setColor(new Color(0,0,0));    
      g.drawRect(225, 90, 255, 60);
      g.drawRoundRect(460, 83, 30, 7, 10, 10);
      g.drawRect(460, 55, 10, 10);
      g.drawRect(468, 55, 12, 10);
      g.drawRect(480, 55, 10, 10);
      
      
      
      //Techo
      g.setColor(new Color(217,123,11));
      int[] valoresX={150,225,300};
      int[] valoresY={150,70,150};
      Polygon poligono1 = new Polygon(valoresX,valoresY,3);
      g.fillPolygon(valoresX,valoresY,3);
      g.setColor(new Color(0,0,0));
      g.drawPolygon(poligono1);
      
      g.setColor(new Color(217,123,11));
      int[] valoresX1={300,360,420};
      int[] valoresY1={150,90,150};
      Polygon poligono2 = new Polygon(valoresX1,valoresY1,3);
      g.fillPolygon(valoresX1,valoresY1,3);
      g.setColor(new Color(0,0,0));
      g.drawPolygon(poligono2);
      
      g.setColor(new Color(217,123,11));
      int[] valoresX2={420,480,540};
      int[] valoresY2={150,90,150};
      Polygon poligono3 = new Polygon(valoresX2,valoresY2,3);
      g.fillPolygon(valoresX2,valoresY2,3);
      g.setColor(new Color(0,0,0));
      g.drawPolygon(poligono3);
      
      //Puerta
      g.setColor(new Color(184,110,4));
      g.fillRect(330, 180, 100, 170);
      g.setColor(new Color(102,61,2));
      g.fillRect(345, 250, 70, 5);
      
      //Arco
        
      Graphics2D g2d_arco = (Graphics2D) g;
      g2d_arco.setPaint(Color.cyan);
      g2d_arco.setStroke(new BasicStroke(8.0f));
      g2d.draw(new Arc2D.Double(345,200,70,70,0,180,Arc2D.PIE));
      
      
      //Sol
      g.setColor(Color.yellow);
      g.fillOval(600, 30, 120, 120);
      
      //baranda
      g.setColor(new Color(184,110,4));   
      
      g.fillRect(150, 480, 550, 10);
      g.fillRect(150, 500, 550, 10);
      
      
      g.setColor(new Color(102,61,2));
      g.fillRect(150, 450, 10, 90);
      g.fillRect(200, 450, 10, 90);
      g.fillRect(250, 450, 10, 90);
      g.fillRect(300, 450, 10, 90);
      g.fillRect(350, 450, 10, 90);
      g.fillRect(400, 450, 10, 90);
      g.fillRect(450, 450, 10, 90);
      g.fillRect(500, 450, 10, 90);
      g.fillRect(550, 450, 10, 90);
      g.fillRect(600, 450, 10, 90);
      g.fillRect(650, 450, 10, 90);
      g.fillRect(700, 450, 10, 90);
      
      
      //arbolito pino
      
      
            
      g.setColor(new Color(5,64,64));
      int[] valoresXPino13={600,675,750};
      int[] valoresYPino13={380,350,380};
      Polygon poligonoPino13 = new Polygon(valoresXPino13,valoresYPino13,3);
      g.fillPolygon(valoresXPino13,valoresYPino13,3);
      
      g.setColor(new Color(5,128,64));
      int[] valoresXPino1={600,675,750};
      int[] valoresYPino1={350,300,350};
      Polygon poligonoPino12 = new Polygon(valoresXPino1,valoresYPino1,3);
      g.fillPolygon(valoresXPino1,valoresYPino1,3);   
      
      
      g.setColor(new Color(5,228,64));
      int[] valoresXPino={600,675,750};
      int[] valoresYPino={300,250,300};
      Polygon poligonoPino = new Polygon(valoresXPino,valoresYPino,3);
      g.fillPolygon(valoresXPino,valoresYPino,3);

      g.setColor(new Color(102,61,2));
      g.fillRect(670, 380, 20, 30);
      
     
      
      
    }
    
}
