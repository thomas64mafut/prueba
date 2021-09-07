/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos;

import javax.swing.UIManager;

public class Principal {
    public static void main(String[] args) {
        asignarLookAndFeel("Nimbus");
        VentanaAMGrupo ventana = new VentanaAMGrupo(null); //se instancia la ventana
        ventana.setLocationRelativeTo(null); //se centra la ventana
        ventana.setVisible(true); //se hace visible la ventana
    }
    
    /**
     * Asigna el look and feel especificado a la ventana
     * @param laf cadena con el nombre del look and feel
     */
    public static void asignarLookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } 
            catch (Exception e2) {
                System.exit(0);
            }
        }
    }
    
}
