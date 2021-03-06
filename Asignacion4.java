import java.awt.Graphics;
import javax.swing.JPanel;
import  java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;


public class Asignacion4 extends JPanel{
    
    public void paintComponent(Graphics g){
    super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        Point2D centro = new Point2D.Float(500,400);
        Point2D centro2 = new Point2D.Float(500,260);
        float puntos[] = {0.1f,1.0f};
        float puntos2[] = {0.1f,1.0f,};
        float radio= 600;
        float radio2= 80;
        Color colores[]={Color.LIGHT_GRAY,new Color(102, 102, 255)};
        Color colores2[]={Color.yellow,new Color(153, 255, 255,170).brighter()};
        g2d.setPaint(new RadialGradientPaint(centro,radio, puntos, colores));
        g2d.fill(new Rectangle2D.Double(0, 0, 1000, 800));
        g2d.setBackground(new Color(102, 102, 255));
        Point2D arriba1 = new Point2D.Float(200,200);
        Point2D abajo1 = new Point2D.Float(200, 400);
        Rectangle2D rectangulo1 = new Rectangle2D.Double(100, 100, 200, 600);
        Rectangle2D rectangulo2 = new Rectangle2D.Double(400, 100, 200, 600);
        Rectangle2D rectangulo3 = new Rectangle2D.Double(700, 100, 200, 600);
        g2d.setPaint(new GradientPaint(arriba1, Color.BLUE.brighter().brighter().brighter(), abajo1, new Color(0, 128, 255)));
        g2d.fill(rectangulo1);
        g2d.setPaint(new GradientPaint(arriba1, new Color(153, 128, 255).brighter(), abajo1, new Color(153,255,255).darker()));
        g2d.fill(rectangulo2);
        g2d.setPaint(new GradientPaint(arriba1, new Color(153, 51, 255).brighter(), abajo1, new Color(153, 51, 255).darker()));
        g2d.fill(rectangulo3);
        Arc2D luna = new Arc2D.Double(50, 50, 100, 100, 90, 360, 2);
        g2d.setPaint(Color.WHITE);
        g2d.fill(new Ellipse2D.Double(140, 200, 130, 140));
        g2d.setPaint(Color.BLUE.brighter());
        g2d.fill(new Ellipse2D.Double(165, 180, 110, 100));
        int puntosx[]={100,100,300,300};
        int puntosy[]={620,700,700,660};
        int puntosx2[]={400,400,600,600};
        int puntosy2[]={620,700,700,660};
        int puntosx3[]={700,700,900,900};
        int puntosy3[]={620,700,700,660};
        int puntosx4[]={100,100,300,300};
        int puntosy4[]={600,620,660,560};
        int puntosx5[]={400,400,600,600};
        int puntosy5[]={600,620,660,560};
        int puntosx6[]={700,700,900,900};
        int puntosy6[]={600,620,660,560};
        int puntosx7[]={100,100,300,300};
        int puntosy7[]={520,600,560,550};
        int puntosx8[]={400,400,600,600};
        int puntosy8[]={520,600,560,550};
        int puntosx9[]={700,700,900,900};
        int puntosy9[]={520,600,560,550};
        int puntosx10[]={100,170,210,170};
        int puntosy10[]={520,531,500,400};
        int puntosx11[]={400,470,510,470};
        int puntosy11[]={520,531,505,400};
        int puntosx12[]={700,770,810,770};
        int puntosy12[]={520,531,500,400};
        int puntosx13[]={170,260,300,300};
        int puntosy13[]={531,430,500,560};
        int puntosx14[]={470,560,600,600};
        int puntosy14[]={531,470,500,560};
        int puntosx15[]={770,860,900,900};
        int puntosy15[]={531,430,500,560};
        GeneralPath fig1= new GeneralPath();
        fig1.moveTo(puntosx[0], puntosy[0]);
        GeneralPath fig2= new GeneralPath();
        fig2.moveTo(puntosx2[0], puntosy2[0]);
        GeneralPath fig3= new GeneralPath();
        fig3.moveTo(puntosx3[0], puntosy3[0]);
        GeneralPath fig4= new GeneralPath();
        fig4.moveTo(puntosx4[0], puntosy4[0]);
        GeneralPath fig5= new GeneralPath();
        fig5.moveTo(puntosx5[0], puntosy5[0]);
        GeneralPath fig6= new GeneralPath();
        fig6.moveTo(puntosx6[0], puntosy6[0]);
        GeneralPath fig7= new GeneralPath();
        fig7.moveTo(puntosx7[0], puntosy7[0]);
        GeneralPath fig8= new GeneralPath();
        fig8.moveTo(puntosx8[0], puntosy8[0]);
        GeneralPath fig9= new GeneralPath();
        fig9.moveTo(puntosx9[0], puntosy9[0]);
        GeneralPath fig10= new GeneralPath();
        fig10.moveTo(puntosx10[0], puntosy10[0]);
        GeneralPath fig11= new GeneralPath();
        fig11.moveTo(puntosx11[0], puntosy11[0]);
        GeneralPath fig12= new GeneralPath();
        fig12.moveTo(puntosx12[0], puntosy12[0]);
        GeneralPath fig13= new GeneralPath();
        fig13.moveTo(puntosx13[0], puntosy13[0]);
        GeneralPath fig14= new GeneralPath();
        fig14.moveTo(puntosx14[0], puntosy14[0]);
        GeneralPath fig15= new GeneralPath();
        fig15.moveTo(puntosx15[0], puntosy15[0]);
        
        for (int i = 0; i < puntosx.length; i++) {
            fig1.lineTo(puntosx[i], puntosy[i]);
            fig2.lineTo(puntosx2[i], puntosy2[i]);
            fig3.lineTo(puntosx3[i], puntosy3[i]);
            fig4.lineTo(puntosx4[i], puntosy4[i]);
            fig5.lineTo(puntosx5[i], puntosy5[i]);
            fig6.lineTo(puntosx6[i], puntosy6[i]);
            fig7.lineTo(puntosx7[i], puntosy7[i]);
            fig8.lineTo(puntosx8[i], puntosy8[i]);
            fig9.lineTo(puntosx9[i], puntosy9[i]);
            fig10.lineTo(puntosx10[i], puntosy10[i]);
            fig11.lineTo(puntosx11[i], puntosy11[i]);
            fig12.lineTo(puntosx12[i], puntosy12[i]);
            fig13.lineTo(puntosx13[i], puntosy13[i]);
            fig14.lineTo(puntosx14[i], puntosy14[i]);
            fig15.lineTo(puntosx15[i], puntosy15[i]);
        }
        fig1.closePath();
        fig2.closePath();
        fig13.closePath();
        
        g2d.setPaint(new Color(0, 51, 25));
        g2d.fill(fig7);
        
        g2d.setPaint(new Color(0, 51, 25).brighter().brighter());
        g2d.fill(fig4);
        g2d.setPaint(new Color(0, 51, 25).brighter().brighter().brighter());
        g2d.fill(fig1);
        g2d.setPaint(new Color(102, 102, 0));
        g2d.fill(fig8);
        g2d.setPaint(new Color(76, 153, 0));
        g2d.fill(fig5);
        g2d.setPaint(new Color(204, 204, 0));
        g2d.fill(fig2);
        g2d.setPaint(new Color(0, 51, 25).darker());
        g2d.fill(fig9);
        g2d.setPaint(new Color(0, 51, 25).brighter());
        g2d.fill(fig6);
        g2d.setPaint(new Color(0, 51, 25).brighter().brighter());
        g2d.fill(fig3);
        g2d.setPaint(new Color(204, 255, 255,100).darker());
        g2d.fill(fig10);
        g2d.setPaint(new Color(204, 255, 255,120));
        g2d.fill(fig11);
        g2d.setPaint(new Color(183, 179, 179,50));
        g2d.fill(fig12);
        g2d.setPaint(Color.WHITE.darker());
        g2d.fill(fig13);
        g2d.fill(fig14);
        g2d.setPaint(Color.WHITE.darker().darker().darker());
        g2d.fill(fig15);
        g2d.setPaint(new Color(245, 245, 245,230).brighter());
        g2d.fillOval(780, 250, 40, 45);
        g2d.setPaint(new RadialGradientPaint(centro2, radio2, puntos2, colores2));
        g2d.fill(new Ellipse2D.Double(425, 190, 150, 150));
        g2d.setPaint(Color.yellow);
        g2d.fill(new Ellipse2D.Double(460, 227, 80, 80));
        g2d.setPaint(Color.green.darker().darker().darker().darker());
        int[] pinox1 = {140,146,143};
        int[] pinoy1 = {533,533,512};
        int[] pinox2 = {180,190,185};
        int[] pinoy2 = {553,553,532};
        int[] pinox3 = {130,140,135};
        int[] pinoy3 = {565,565,540};
        int[] pinox4 = {160,180,170};
        int[] pinoy4 = {665,665,635};
        int[] pinox5 = {120,140,130};
        int[] pinoy5 = {685,685,655};
        int[] pinox6 = {220,240,230};
        int[] pinoy6 = {595,595,560};
        int[] pinox7 = {250,270,260};
        int[] pinoy7 = {635,635,605};
        int[] pinox8 = {185,200,193};
        int[] pinoy8 = {615,615,600};
        g2d.fill(new Polygon(pinox1, pinoy1, 3));
        g2d.fill(new Polygon(pinox2, pinoy2, 3));
        g2d.fill(new Polygon(pinox3, pinoy3, 3));
        g2d.fill(new Polygon(pinox4, pinoy4, 3));
        g2d.fill(new Polygon(pinox5, pinoy5, 3));
        g2d.fill(new Polygon(pinox6, pinoy6, 3));
        g2d.fill(new Polygon(pinox7, pinoy7, 3));
        g2d.fill(new Polygon(pinox8, pinoy8, 3));

        g2d.setPaint(Color.green.darker().darker().darker());
         int[] pinox21 = {440,446,443};
        int[] pinoy21 = {533,533,512};
        int[] pinox22 = {480,490,485};
        int[] pinoy22 = {553,553,532};
        int[] pinox23 = {430,440,435};
        int[] pinoy23 = {565,565,540};
        int[] pinox24 = {460,480,470};
        int[] pinoy24 = {665,665,635};
        int[] pinox25 = {420,440,430};
        int[] pinoy25 = {685,685,655};
        int[] pinox26 = {520,540,530};
        int[] pinoy26 = {595,595,560};
        int[] pinox27 = {550,570,560};
        int[] pinoy27 = {635,635,605};
        int[] pinox28 = {485,500,493};
        int[] pinoy28 = {615,615,600};
        g2d.fill(new Polygon(pinox21, pinoy21, 3));
        g2d.fill(new Polygon(pinox22, pinoy22, 3));
        g2d.fill(new Polygon(pinox23, pinoy23, 3));
        g2d.fill(new Polygon(pinox24, pinoy24, 3));
        g2d.fill(new Polygon(pinox25, pinoy25, 3));
        g2d.fill(new Polygon(pinox26, pinoy26, 3));
        g2d.fill(new Polygon(pinox27, pinoy27, 3));
        g2d.fill(new Polygon(pinox28, pinoy28, 3));

        g2d.setPaint(Color.green.darker().darker());
         int[] pinox31 = {740,746,743};
        int[] pinoy31 = {533,533,512};
        int[] pinox32 = {780,790,785};
        int[] pinoy32 = {553,553,532};
        int[] pinox33 = {730,740,735};
        int[] pinoy33 = {565,565,540};
        int[] pinox34 = {760,780,770};
        int[] pinoy34 = {665,665,635};
        int[] pinox35 = {720,740,730};
        int[] pinoy35 = {685,685,655};
        int[] pinox36 = {820,840,830};
        int[] pinoy36 = {595,595,560};
        int[] pinox37 = {850,870,860};
        int[] pinoy37 = {635,635,605};
        int[] pinox38 = {785,800,793};
        int[] pinoy38 = {615,615,600};
        g2d.fill(new Polygon(pinox31, pinoy31, 3));
        g2d.fill(new Polygon(pinox32, pinoy32, 3));
        g2d.fill(new Polygon(pinox33, pinoy33, 3));
        g2d.fill(new Polygon(pinox34, pinoy34, 3));
        g2d.fill(new Polygon(pinox35, pinoy35, 3));
        g2d.fill(new Polygon(pinox36, pinoy36, 3));
        g2d.fill(new Polygon(pinox37, pinoy37, 3));
        g2d.fill(new Polygon(pinox38, pinoy38, 3));
        g2d.setPaint(Color.white);
        g2d.fill(new Ellipse2D.Double(200, 130, 3, 3));
        g2d.fill(new Ellipse2D.Double(150, 150, 3, 3));
        g2d.fill(new Ellipse2D.Double(240, 120, 3, 3));
        g2d.fill(new Ellipse2D.Double(170, 170, 2, 2));
        g2d.fill(new Ellipse2D.Double(250, 135, 3, 3));
        g2d.fill(new Ellipse2D.Double(270, 210, 3, 3));
        g2d.fill(new Ellipse2D.Double(250, 190, 2, 2));
        g2d.fill(new Ellipse2D.Double(220, 180, 2, 2));
        g2d.fill(new Ellipse2D.Double(150, 190, 2, 2));
        g2d.fill(new Ellipse2D.Double(120, 180, 2, 2));

        g2d.fill(new Ellipse2D.Double(800, 130, 3, 3));
        g2d.fill(new Ellipse2D.Double(750, 150, 3, 3));
        g2d.fill(new Ellipse2D.Double(840, 120, 3, 3));
        g2d.fill(new Ellipse2D.Double(770, 170, 2, 2));
        g2d.fill(new Ellipse2D.Double(850, 135, 3, 3));
        g2d.fill(new Ellipse2D.Double(870, 210, 3, 3));
        g2d.fill(new Ellipse2D.Double(850, 190, 2, 2));
        g2d.fill(new Ellipse2D.Double(820, 180, 2, 2));
        g2d.fill(new Ellipse2D.Double(750, 190, 2, 2));
        g2d.fill(new Ellipse2D.Double(720, 180, 2, 2));
        
        
    }
    
}
