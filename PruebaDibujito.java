package com.mycompany.examenii;

/**
 *
 * @author Suazo
 */

import javax.swing.JFrame;

public class PruebaDibujito {

    public static void main(String[] args) {
        // create frame
      JFrame frame = new JFrame("2do examen Parcial Doc. Estrada");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //
      Dibujito dibujito = new Dibujito();
      frame.add(dibujito); 
      frame.setSize(800, 600);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
        
        
    }
    
}
