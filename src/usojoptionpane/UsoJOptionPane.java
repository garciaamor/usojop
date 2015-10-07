

package usojoptionpane;

import javax.swing.JOptionPane;


public class UsoJOptionPane {

  
    public static void main(String[] args) {
        float base, altura;
        String resposta=JOptionPane.showInputDialog("base :");
        base= Float.parseFloat(resposta);
        JOptionPane.showMessageDialog (null,"base ="+ base);
    }
    
}
