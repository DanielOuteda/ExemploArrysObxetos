/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraysobxetos;

import javax.swing.JOptionPane;

/**
 *
 * @author doutedasolla
 */
public class PedirDato {

    public static int pedirInt() {
        return Integer.parseInt(JOptionPane.showInputDialog("Escribe numero : "));
    }
    public static int pedirInt(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

    public static String pedirNome() {
        return JOptionPane.showInputDialog("Escribe Nome : ");
    }
    
    public static String pedirNome(String message) {
        return JOptionPane.showInputDialog(message);
    }
}
