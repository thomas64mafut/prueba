package autores.modelos;

import javax.swing.*;

/**
 *
 * @author Thomas Mafut & Luis Medina Raed
 */
public class ModeloComboCargos extends DefaultComboBoxModel {
    // Metodos
    public ModeloComboCargos() {
        for (Cargo cargo : Cargo.values()) {
            this.addElement(cargo);
        }

    }
    public Cargo obtenerCargo() {
        return (Cargo)this.getSelectedItem();
    }
}